package com.wang.extmall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.wang.extmall.model.Address;
import com.wang.extmall.model.User;


/**
 * Created by ozintel06 on 2016/12/27.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  03/02/2017 15:27
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

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
}
