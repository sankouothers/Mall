package com.wang.extmall.repository;

import com.wang.extmall.model.User;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/22/2016 14:39
 */
public interface UserRepository extends CrudRepository<User, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByName.
   *
   * @param   name  String
   *
   * @return  User
   */
  User findByName(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByNameAndPassWord.
   *
   * @param   name      String
   * @param   password  String
   *
   * @return  User
   */
  User findByNameAndPassWord(String name, String password);
}
