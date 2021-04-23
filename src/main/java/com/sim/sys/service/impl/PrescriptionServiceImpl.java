package com.sim.sys.service.impl;

import com.sim.sys.entity.Prescription;
import com.sim.sys.dao.PrescriptionDao;
import com.sim.sys.entity.Result;
import com.sim.sys.service.PrescriptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Prescription)表服务实现类
 *
 * @author makejava
 * @since 2021-04-23 09:33:33
 */
@Service("prescriptionService")
public class PrescriptionServiceImpl implements PrescriptionService {
    @Resource
    private PrescriptionDao prescriptionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Prescription queryById(String id) {
        return this.prescriptionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Prescription> queryAllByLimit(int offset, int limit) {
        return this.prescriptionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param prescription 实例对象
     * @return 实例对象
     */
    @Override
    public Result insert(Prescription prescription) {
        Result result = new Result();

        if (this.prescriptionDao.queryById(prescription.getMedicineId()) != null) result.setResult("no");
        else if (this.prescriptionDao.insert(prescription) == 0) result.setResult("no");
        else result.setResult("yes");

        return result;
    }

    /**
     * 修改数据
     *
     * @param prescription 实例对象
     * @return 实例对象
     */
    @Override
    public Prescription update(Prescription prescription) {
        this.prescriptionDao.update(prescription);
        return this.queryById(prescription.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.prescriptionDao.deleteById(id) > 0;
    }
}
