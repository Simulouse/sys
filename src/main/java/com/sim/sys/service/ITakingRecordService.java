package com.sim.sys.service;

import com.sim.sys.entity.Result;
import com.sim.sys.entity.TakingRecord;

import java.util.List;

public interface ITakingRecordService {

    List<TakingRecord> findAllByFilter(TakingRecord takingRecord);

    Result insert(TakingRecord takingRecord);
}
