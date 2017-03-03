package com.wang.extmall.service;

import java.util.List;

import com.wang.extmall.model.Address;
import com.wang.extmall.model.User;


/**
 * Created by ozintel06 on 2016/12/27.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  03/02/2017 15:27
 */
public interface AddressService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param  id  long
   */
  void delete(long id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByConsumer.
   *
   * @param   consumer  User
   *
   * @return  List
   */
  List<Address> findByConsumer(User consumer);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findById.
   *
   * @param   id  long
   *
   * @return  List
   */
  List<Address> findById(long id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findOne.
   *
   * @param   id  long
   *
   * @return  Address
   */
  Address findOne(long id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param   address  Address
   *
   * @return  Address
   */
  Address save(Address address);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * saveOrUpdate.
   *
   * @param  address  Address
   */
  void saveOrUpdate(Address address);
} // end interface AddressService
