package com.wang.extmall.service;

import java.util.ArrayList;
import java.util.List;

import com.wang.extmall.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import com.wang.extmall.config.UserDetail;
import com.wang.extmall.model.Role;
import com.wang.extmall.model.User;


/**
 * Created by ozintel06 on 2016/12/6.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/06/2016 16:22
 */
@Service public class MyUserDetailsService implements UserDetailsService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserRepository userRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
   */
  @Override public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    User user;

    try {
      user = userRepository.findByName(userName);
    } catch (Exception e) {
      throw new UsernameNotFoundException("user select fail");
    }

    if (user == null) {
      throw new UsernameNotFoundException("no user found");
    } else {
      try {
        List<Role> roles = new ArrayList<Role>();

        for (Role role : user.getRoleSet()) {
          roles.add(role);
        }

        return new UserDetail(user, roles);
      } catch (Exception e) {
        throw new UsernameNotFoundException("user role select fail");
      }
    }
  } // end method loadUserByUsername
} // end class MyUserDetailsService
