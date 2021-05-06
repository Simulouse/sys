package com.sim.sys.dao;

import com.sim.sys.entity.DeliveryStorage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliveryStorageDao {

    int insertDeliveryStorage(List<DeliveryStorage> records);

//    int deleteDeliveryMedicineById(@Param("deliveryId") String deliveryId);

}
