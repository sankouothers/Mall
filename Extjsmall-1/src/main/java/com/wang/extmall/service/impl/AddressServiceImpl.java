package com.wang.extmall.service.impl;

import java.util.List;
import java.util.function.Consumer;

import com.wang.extmall.model.Address;
import com.wang.extmall.model.User;
import com.wang.extmall.repository.AddressRepository;
import com.wang.extmall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ozintel06 on 2016/12/27.
 */
@Service @Transactional
public class AddressServiceImpl implements AddressService {

  @Autowired
  private AddressRepository addressRepository;
  @Override
  public void save(Address address) {
    addressRepository.save(address);
  }

  @Override
  public List<Address> findById(long id) {
    return addressRepository.findById(id);
  }

  @Override
  public List<Address> findByConsumer(User consumer) {
    return addressRepository.findByConsumer(consumer);
  }
}
