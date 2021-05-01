package com.sim.sys.dao;

import com.sim.sys.entity.DeliveryMedicine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliveryMedicineDao {

    int insertDeliveryMedicine(List<DeliveryMedicine> records);

    int deleteDeliveryMedicineById(@Param("deliveryId") String deliveryId);

}
