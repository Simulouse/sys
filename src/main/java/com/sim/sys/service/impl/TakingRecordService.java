package com.sim.sys.service.impl;

import com.sim.sys.dao.TakingRecordDao;
import com.sim.sys.entity.Result;
import com.sim.sys.entity.TakingRecord;
import com.sim.sys.service.ITakingRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("takingRecordService")
public class TakingRecordService implements ITakingRecordService {

    @Resource
    private TakingRecordDao takingRecordDao;

    @Override
    public List<TakingRecord> findAllByFilter(com.sim.sys.entity.TakingRecord takingRecord) {
        return takingRecordDao.findAllTakingRecordByFilter(takingRecord);
    }

    @Override
    public Result insert(TakingRecord takingRecord) {
        Result result = new Result();
        result.setResult("ok");

        if (takingRecordDao.findTakingRecordById(takingRecord.getTakeRecordId()) != null) {
            result.setResult("no");
            return result;
        }

        if (takingRecordDao.insertTakingRecord(takingRecord) == 0) result.setResult("no");

        return result;
    }
}
