package com.wang.extmall.service.impl;

import com.wang.extmall.model.User;
import com.wang.extmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wang.extmall.repository.UserRepository;

import java.util.List;


/**
 * Created by ozintel06 on 16/7/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/22/2016 14:39
 */
@Service @Transactional public class UserServiceImpl implements UserService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserRepository userRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  UserService#findByName(String)
   */
  @Override public User findByName(String name) {
    return userRepository.findByName(name);
  }

  @Override
  public List<User> findAll() {
    return (List<User>) userRepository.findAll();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  UserService#findByNameAndPassWord(String, String)
   */
  @Override public User findByNameAndPassWord(String name, String password) {
    return userRepository.findByNameAndPassWord(name, password);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  UserService#findOne(Long)
   */
  @Override public User findOne(Long id) {
    return userRepository.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  UserService#save(User)
   */
  @Override public void save(User user) {
    userRepository.save(user);
  }
} // end class UserServiceImpl
