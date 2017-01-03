package com.wang.extmall.repository;

import com.wang.extmall.model.Commodity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ozintel06 on 2016/12/28.
 */
public interface CommodityRepository extends CrudRepository<Commodity, Long>, JpaSpecificationExecutor {

  List<Commodity> findByOrderByCreateDateDesc();

}
