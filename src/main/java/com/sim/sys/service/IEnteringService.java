package com.sim.sys.service;

import com.sim.sys.entity.Entering;
import com.sim.sys.entity.Result;

import java.util.List;


public interface IEnteringService {

    List<Entering> findAll(Entering entering);


    Result insert(Entering entering);


    Result update(String enteringId, int state);

}
