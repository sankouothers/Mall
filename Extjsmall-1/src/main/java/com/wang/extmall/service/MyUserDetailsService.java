package com.wang.extmall.service;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.wang.extmall.config.UserDetail;
import com.wang.extmall.model.Role;
import com.wang.extmall.model.User;
import com.wang.extmall.repository.UserRepository;


/**
 * Created by ozintel06 on 2016/12/6.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/06/2016 16:22
 */
@Service @Transactional public class MyUserDetailsService implements UserDetailsService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserRepository userRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
   */
  @Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User      user    = userRepository.findByName(username);
    Set<Role> roleSet = user.getRoleSet();

    return new UserDetail(user, roleSet);
  }

} // end class MyUserDetailsService
