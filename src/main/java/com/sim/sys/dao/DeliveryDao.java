package com.sim.sys.dao;

import com.sim.sys.entity.Delivery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliveryDao {

    int insertDelivery(Delivery delivery);

    List<Delivery> findAllDeliveryByFilter(Delivery delivery);

    Delivery findDeliveryById(@Param("deliveryId") String deliveryId);
}
