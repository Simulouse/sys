package com.sim.sys.dao;

import com.sim.sys.entity.Entering;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EnteringDao {

    List<Entering> findAllEnteringByFilter(Entering entering);

    Entering findEnteringById(String enteringId);

    int insertEntering(Entering entering);

    int updateEnteringById(String enteringId, int state);

}

