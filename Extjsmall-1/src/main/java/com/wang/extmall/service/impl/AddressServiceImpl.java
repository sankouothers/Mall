package com.wang.extmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.wang.extmall.model.Address;
import com.wang.extmall.model.User;
import com.wang.extmall.repository.AddressRepository;
import com.wang.extmall.service.AddressService;


/**
 * Created by ozintel06 on 2016/12/27.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  03/02/2017 15:27
 */
@Service @Transactional public class AddressServiceImpl implements AddressService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private AddressRepository addressRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  com.wang.extmall.service.AddressService#delete(long)
   */
  @Override public void delete(long id) {
    addressRepository.delete(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  com.wang.extmall.service.AddressService#findByConsumer(com.wang.extmall.model.User)
   */
  @Override public List<Address> findByConsumer(User consumer) {
    return addressRepository.findByConsumer(consumer);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  com.wang.extmall.service.AddressService#findById(long)
   */
  @Override public List<Address> findById(long id) {
    return addressRepository.findById(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  com.wang.extmall.service.AddressService#findOne(long)
   */
  @Override public Address findOne(long id) {
    return addressRepository.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  com.wang.extmall.service.AddressService#save(com.wang.extmall.model.Address)
   */
  @Override public Address save(Address address) {
    return addressRepository.save(address);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  com.wang.extmall.service.AddressService#saveOrUpdate(com.wang.extmall.model.Address)
   */
  @Override public void saveOrUpdate(Address address) {
    addressRepository.save(address);
  }
} // end class AddressServiceImpl
