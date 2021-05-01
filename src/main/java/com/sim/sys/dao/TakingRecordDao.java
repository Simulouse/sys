package com.sim.sys.dao;

import com.sim.sys.entity.TakingRecord;

import java.util.List;

public interface TakingRecordDao {

    List<TakingRecord> findAllTakingRecordByFilter(TakingRecord takingRecord);

    TakingRecord findTakingRecordById(String takingRecordId);

    int insertTakingRecord(TakingRecord takingRecord);


}
