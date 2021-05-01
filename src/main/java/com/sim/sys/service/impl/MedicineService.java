package com.sim.sys.service.impl;

import com.sim.sys.entity.Medicine;
import com.sim.sys.dao.MedicineDao;
import com.sim.sys.entity.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbMedicine)表服务实现类
 *
 * @author makejava
 * @since 2021-04-20 09:46:01
 */
@Service("tbMedicineService")
public class MedicineService implements com.sim.sys.service.IMedicineService {
    @Resource
    private MedicineDao medicineDao;

    /**
     * 通过ID查询单条数据
     *
     * @param medicineId 主键
     * @return 实例对象
     */
    @Override
    public Medicine queryById(String medicineId) {
        return this.medicineDao.queryById(medicineId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Medicine> queryAllByLimit(int offset, int limit) {
        return this.medicineDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Medicine> queryExpiredMedicine() {
        return medicineDao.queryExpiredMedicine();
    }

    /**
     * 新增数据
     *
     * @param medicine 实例对象
     * @return 实例对象
     */
    @Override
    public Result insert(Medicine medicine) {
        Result result = new Result();

        if (this.medicineDao.queryById(medicine.getMedicineId()) != null) result.setResult("no");
        else if (this.medicineDao.insert(medicine) == 0) result.setResult("no");
        else result.setResult("yes");

        return result;
    }

    /**
     * 修改数据
     *
     * @param medicine 实例对象
     * @return 实例对象
     */
    @Override
    public Medicine update(Medicine medicine) {
        this.medicineDao.update(medicine);
        return this.queryById(medicine.getMedicineId());
    }

    /**
     * 通过主键删除数据
     *
     * @param medicineId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String medicineId) {
        return this.medicineDao.deleteById(medicineId) > 0;
    }

    /**
     * 通过主键查询数量
     * @param medicineId 主键
     * @return 是否成功
     */
    @Override
    public int queryNumById(String medicineId) {
        return medicineDao.queryNumById(medicineId);
    }


}
