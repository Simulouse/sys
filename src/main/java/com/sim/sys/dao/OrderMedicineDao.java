package com.sim.sys.dao;


import com.sim.sys.entity.OrderMedicine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMedicineDao {

    int insertOrderMedicine(List<OrderMedicine> records);

    int deleteOrderMedicineById(@Param("orderId")String orderId);

}
