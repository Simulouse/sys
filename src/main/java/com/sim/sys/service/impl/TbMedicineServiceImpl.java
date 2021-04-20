package com.sim.sys.service.impl;

import com.sim.sys.entity.TbMedicine;
import com.sim.sys.dao.TbMedicineDao;
import com.sim.sys.service.TbMedicineService;
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
public class TbMedicineServiceImpl implements TbMedicineService {
    @Resource
    private TbMedicineDao tbMedicineDao;

    /**
     * 通过ID查询单条数据
     *
     * @param medicineId 主键
     * @return 实例对象
     */
    @Override
    public TbMedicine queryById(String medicineId) {
        return this.tbMedicineDao.queryById(medicineId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbMedicine> queryAllByLimit(int offset, int limit) {
        return this.tbMedicineDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbMedicine 实例对象
     * @return 实例对象
     */
    @Override
    public TbMedicine insert(TbMedicine tbMedicine) {
        this.tbMedicineDao.insert(tbMedicine);
        return tbMedicine;
    }

    /**
     * 修改数据
     *
     * @param tbMedicine 实例对象
     * @return 实例对象
     */
    @Override
    public TbMedicine update(TbMedicine tbMedicine) {
        this.tbMedicineDao.update(tbMedicine);
        return this.queryById(tbMedicine.getMedicineId());
    }

    /**
     * 通过主键删除数据
     *
     * @param medicineId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String medicineId) {
        return this.tbMedicineDao.deleteById(medicineId) > 0;
    }
}
