package com.sim.sys.service;

import com.sim.sys.entity.Delivery;
import com.sim.sys.entity.Result;
import com.sim.sys.entity.Storage;

import java.util.List;

public interface IStorageService {

    List<Storage> findAllByFilter(Storage storage);

    Result insert(List<Storage> storage, String enteringId, String enteringTime);

    Result updateState(String storageId, int state);

    Result updateRestNums(String storageId, int takeNums);
}
