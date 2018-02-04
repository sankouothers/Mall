package com.wang.extmall;

import com.wang.extmall.model.Role;
import com.wang.extmall.model.User;
import com.wang.extmall.repository.IndentRepository;
import com.wang.extmall.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  05/12/2016 18:38
 */
@SpringBootApplication @ServletComponentScan
public class Application {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * main.
   *
   * @param  args  String[]
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
//在启动项目的时候往数据库添加预制数据
//  @Bean
//  CommandLineRunner commandLineRunner(UserRepository userRepository, IndentRepository indentRepository) {
//      return (String... var1) -> {
//        User user = new User();
//        user.setId(Long.valueOf("1"));
//        user.setCreateDate(null);
//        user.setiDCardNumber("421123199408210010");
//        user.setAnswer("wang");
//        user.setName("pin");
//        user.setPhoneNumber("18111678350");
//        user.setPassWord("123456");
//        user.setQuestion("who are you ?");
//        user.setUserName("san");
//        userRepository.save(user);
//      };
//  }
}
