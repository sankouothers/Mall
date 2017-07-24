package com.wang.extmall.service;

import com.wang.extmall.model.Commodity;

import java.util.List;

/**
 * Created by ozintel06 on 2016/12/28.
 */
public interface CommodityService {


  List<Commodity> findByOrderByCreateDateDesc();

  Commodity findOne(long id);

  Commodity save(Commodity commodity);
}
