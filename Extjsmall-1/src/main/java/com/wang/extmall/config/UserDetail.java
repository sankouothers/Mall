package com.wang.extmall.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.wang.extmall.model.Role;
import com.wang.extmall.model.User;
import org.springframework.security.util.SimpleMethodInvocation;


/**
 * Created by ozintel06 on 2016/12/6.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/06/2016 16:09
 */
public class UserDetail extends User implements UserDetails {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Set<Role> roles;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new UserDetail object.
   *
   * @param  user   User
   * @param  roles  List
   */
  public UserDetail(User user, Set<Role> roles) {
    super(user);
    this.roles = roles;
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.core.userdetails.UserDetails#getAuthorities()
   */
  @Override public Collection<? extends GrantedAuthority> getAuthorities() {
Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
    if (roles != null){
      for (Role role : roles){
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
        authorities.add(authority);
      }
    }

    return authorities;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.core.userdetails.UserDetails#getPassword()
   */
  @Override public String getPassword() {
    return super.getPassWord();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.core.userdetails.UserDetails#getUsername()
   */
  @Override public String getUsername() {
    return super.getName();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
   */
  @Override public boolean isAccountNonExpired() {
    return true;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
   */
  @Override public boolean isAccountNonLocked() {
    return true;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
   */
  @Override public boolean isCredentialsNonExpired() {
    return true;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.core.userdetails.UserDetails#isEnabled()
   */
  @Override public boolean isEnabled() {
    return true;
  }
} // end class UserDetail
