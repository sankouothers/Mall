package com.wang.extmall.config;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import com.wang.extmall.service.MyUserDetailsService;


/**
 * Created by ozintel06 on 2016/12/6.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/06/2016 16:09
 */
@Component public class UserAuthenticationProvider implements AuthenticationProvider {


  @Autowired
  private MyUserDetailsService userDetailsService;

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {

      UserDetails userDetails = userDetailsService.loadUserByUsername(authentication.getName());

      UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(
          userDetails, authentication.getCredentials(),userDetails.getAuthorities());
      return result;

  }

  @Override
  public boolean supports(Class<?> aClass) {
    return true;
  }
} // end class UserAuthenticationProvider
