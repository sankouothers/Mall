package com.wang.extmall.service.impl;

import com.wang.extmall.model.Commodity;
import com.wang.extmall.repository.CommodityRepository;
import com.wang.extmall.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by ozintel06 on 2016/12/28.
 */
@Service
@Transactional
public class CommodityServiceImpl implements CommodityService {

  @Autowired private CommodityRepository commodityRepository;

  @Override
  public List<Commodity> findByOrderByCreateDateDesc() {
    return commodityRepository.findByOrderByCreateDateDesc();
  }

  @Override
  public Commodity findOne(long id) {
    return commodityRepository.findOne(id);
  }

  @Override
  public Commodity save(Commodity commodity) {
    return commodityRepository.save(commodity);
  }

}
