package com.sim.sys.service.impl;

import com.sim.sys.entity.Entering;
import com.sim.sys.entity.Result;
import org.springframework.stereotype.Service;

import java.util.List;


//
//import com.sim.sys.entity.Entering;
//import com.sim.sys.dao.EnteringDao;
//import com.sim.sys.entity.Result;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.List;


@Service("enteringService")
public class EnteringService implements com.sim.sys.service.IEnteringService {
    @Override
    public Entering queryById(String orderId) {
        return null;
    }

    @Override
    public List<Entering> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Result insert(Entering entering) {
        return null;
    }

    @Override
    public Entering update(Entering entering) {
        return null;
    }

    @Override
    public boolean deleteById(String orderId) {
        return false;
    }
}

//
//    @Resource
//    private EnteringDao enteringDao;
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param orderId 主键
//     * @return 实例对象
//     */
//    @Override
//    public Entering queryById(String orderId) {
//        return this.enteringDao.queryById(orderId);
//    }
//
//    /**
//     * 查询多条数据
//     *
//     * @param offset 查询起始位置
//     * @param limit  查询条数
//     * @return 对象列表
//     */
//    @Override
//    public List<Entering> queryAllByLimit(int offset, int limit) {
//        return this.enteringDao.queryAllByLimit(offset, limit);
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param entering 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public Result insert(Entering entering) {
//        Result result = new Result();
//        if(this.enteringDao.queryById(entering.getOrderId())!=null) result.setResult("no");
//        else if(this.enteringDao.insert(entering)==0) result.setResult("no");
//        else result.setResult("yes");
//        return result;
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param entering 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public Entering update(Entering entering) {
//        this.enteringDao.update(entering);
//        return this.queryById(entering.getOrderId());
//    }
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param orderId 主键
//     * @return 是否成功
//     */
//    @Override
//    public boolean deleteById(String orderId) {
//        return this.enteringDao.deleteById(orderId) > 0;
//    }
//}
