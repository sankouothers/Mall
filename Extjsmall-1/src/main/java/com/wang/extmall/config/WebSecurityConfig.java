package com.wang.extmall.config;


import com.wang.extmall.service.MyUserDetailsService;
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
//  @Autowired private MyUserDetailsService myUserDetailsService;
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
    //     在内存中创建了一个用户，该用户的名称为user，密码为password，用户角色为USER。
//    .inMemoryAuthentication().withUser("user").password("password").roles("USER");
//    auth.userDetailsService(userLoginService);
    auth.authenticationProvider(provider);
//    auth.inMemoryAuthentication().withUser("mkyong").password("123456").roles("USER");
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
   */
  @Override protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable().authorizeRequests()
        .and()
//      authorizeRequests()定义哪些URL需要被保护、哪些不需要被保护
        .authorizeRequests()
        //        定义不用限制的路径
//        .antMatchers("请求路径").permitAll()
        .antMatchers("/extmall").permitAll()
        //        定义需要控制访问的路径
//        .antMatchers("请求路径").hasRole("角色")
//        .antMatchers("/extmall").hasRole("USER")
        .anyRequest().authenticated()
//      formLogin()定义当需要用户登录时候，转到的登录页面
        .and()
        .formLogin()
        .loginPage("/login")
        .usernameParameter("name")
        .passwordParameter("passWord")
        .failureUrl("/login?error=true")
        .permitAll()
        .and()
        .logout()
        .permitAll();
    http.headers().frameOptions().disable();
  }
}
