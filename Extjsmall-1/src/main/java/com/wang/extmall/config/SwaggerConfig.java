package com.wang.extmall.config;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.wang.extmall.command.UserCommand;
import io.swagger.models.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.context.request.async.DeferredResult;

import static com.google.common.base.Predicates.or;

import static springfox.documentation.builders.PathSelectors.regex;

import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;

import springfox.documentation.spring.web.plugins.Docket;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by ozintel06 on 2017/7/27.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  07/27/2017 15:27
 */
@Configuration @EnableSwagger2 public class SwaggerConfig {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * demoApi.
   *
   * @return  Docket
   */
  @Bean public Docket mallApi() {
    return new Docket(DocumentationType.SWAGGER_2)
//        .groupName("user")                                        //如果存在多个Docket实例，那么每个实例都必须具有该方法所提供的唯一的groupName
        .genericModelSubstitutes(DeferredResult.class)
        .useDefaultResponseMessages(false)
        .forCodeGeneration(false)
        .pathMapping("/")                                           //设置请求的统一前缀(所有的 API 请求路径前面都会加上这个前缀)
        .select()                                                   // 选择那些路径和api会生成document
//        .apis(RequestHandlerSelectors.any())                      // 对所有api进行监控
//        .paths(**)                                                //可以根据url路径设置哪些请求加入文档，忽略哪些请求
        .paths(Predicates.not(PathSelectors.regex("/error")))       // 过滤接口,忽略匹配的请求接口
        .build()
//        .select().paths(Predicates.or(regex("/user/.*"))).build() // 过滤接口,只会显示匹配的接口
        .ignoredParameterTypes(ApiIgnore.class)                     //注解复杂参数的配置（例:UserCommand）
        .apiInfo(mallApiInfo());
  }


  //多个Docket实例的例子,可以做到每个请求前缀都单独列出,做为一个单元的 API 的测试
  @Bean public Docket userApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .groupName("user")
        .genericModelSubstitutes(DeferredResult.class)
        .useDefaultResponseMessages(false)
        .forCodeGeneration(false)
        .pathMapping("/")                                           //设置请求的统一前缀(所有的 API 请求路径前面都会加上这个前缀)
        .select()                                                   // 选择那些路径和api会生成document
//        .apis(RequestHandlerSelectors.any())                      // 对所有api进行监控
//        .paths(**)                                                //可以根据url路径设置哪些请求加入文档，忽略哪些请求
        .paths(Predicates.not(PathSelectors.regex("/error")))       // 过滤接口,忽略匹配的请求接口
        .build()
        .select().paths(Predicates.or(regex("/user.*"))).build() // 过滤接口,只会显示匹配的接口
        .ignoredParameterTypes(ApiIgnore.class)                     //注解复杂参数的配置（例:UserCommand）
        .apiInfo(mallApiInfo());
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  private ApiInfo mallApiInfo() {
//    return new ApiInfo(                                      //有序的信息 备注
//        "Electronic Health Record(EHR) Platform API",        // 大标题
//        "EHR Platform's REST API, for system administrator", // 描述
//        "1.0",                                               // 版本
//        "NO terms of service",                               // 服务条款
//        "362479845@qq.com",                                  // 作者
//        "The Apache License, Version 2.0",                   // 链接显示文字
//        "http://www.apache.org/licenses/LICENSE-2.0.html"    // 网站链接
//      );

    return new ApiInfoBuilder()           //API 信息备注
        .title("Mall API")                //设置文档的标题
        .description("商城 API")           //设置文档的描述
        .version("1.0")                   //设置文档的版本信息
        .contact("http://www.abc.com")    //设置作者 creator
        .termsOfServiceUrl("www.abc.com") //设置文档的License信息
        .build();
  }

  private Predicate<String> paths() {
    return Predicates.not(PathSelectors.regex("/error"));
  }
} // end class SwaggerConfig
