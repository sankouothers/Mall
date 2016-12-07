package com.wang.extmall.config;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Created by ozintel06 on 2016/12/5.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/05/2016 10:04
 */
@Configuration @EnableWebSecurity public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  @Autowired private UserAuthenticationProvider provider;

  /**
   * @see  org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.WebSecurity)
   */
  @Override public void configure(WebSecurity web) throws Exception {
    web
        .ignoring()
        .antMatchers("/bootstrap/**")
        .and()
        .ignoring()
        .antMatchers("/ext-6.2.0/**");
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * configureGlobal.
   *
   * @param   auth  AuthenticationManagerBuilder
   *
   * @throws  Exception  exception
   */
  @Autowired public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(provider);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
   */
  @Override protected void configure(HttpSecurity http) throws Exception {
    http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/login", "/extmall").permitAll()
        .anyRequest().authenticated()
        .and()
        .formLogin()
        .loginPage("/login")
        .failureUrl("/login?error=true")
        .loginProcessingUrl("/j_spring_security_check")
        .usernameParameter("j_username")
        .passwordParameter("j_password")
        .permitAll()
        .and()
        .logout()
        .logoutUrl("/logout")
        .logoutSuccessUrl("/extmall")
        .invalidateHttpSession(true);


  }
}
