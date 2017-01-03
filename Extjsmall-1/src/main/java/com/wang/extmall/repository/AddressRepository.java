package com.wang.extmall.repository;

import java.util.List;

import com.wang.extmall.model.Address;
import com.wang.extmall.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ozintel06 on 2016/12/27.
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
  List<Address> findById(long id);

  List<Address> findByConsumer(User consumer);
}
