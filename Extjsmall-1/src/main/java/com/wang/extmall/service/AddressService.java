package com.wang.extmall.service;

import java.util.List;

import com.wang.extmall.model.Address;
import com.wang.extmall.model.User;

/**
 * Created by ozintel06 on 2016/12/27.
 */
public interface AddressService {

  void save(Address address);

  List<Address> findById(long id);

  List<Address> findByConsumer(User consumer);
}
