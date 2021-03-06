package com.sim.sys.dao;

import com.sim.sys.entity.OrderMedicine;
import com.sim.sys.entity.Storage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StorageDao {

    List<Storage> findStorageByOrderId(String orderId);

    List<Storage> findAllStorageByFilter(Storage storage);

    int insertStorageBatch(List<Storage> storages);

//    int deleteStorageById(@Param("storageId")String storageId);

    int updateStorageStateById(@Param("storageId") String storageId, @Param("state") int state);

    int updateStorageRestNumsById(@Param("storageId") String storageId, @Param("takeNums") int takeNums);

}
