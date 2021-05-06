package com.sim.sys.service;

import com.sim.sys.entity.Delivery;
import com.sim.sys.entity.Result;
import com.sim.sys.entity.Storage;

import java.util.List;

public interface IStorageService {

    List<Storage> findAllByFilter(Storage storage);

    Result insert(List<Storage> storage);

    Result delete(Delivery delivery);
}
