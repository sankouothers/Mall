package com.wang.extmall.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.wang.extmall.command.UserCommand;

import com.wang.extmall.data.Wang;
import com.wang.extmall.xml.CDATAPrettyPrintWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.jsp.tagext.VariableInfo;
import java.io.Writer;
import java.util.List;

/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  11/30/2016 17:00
 */
@Configuration @EnableWebMvc public class WebMvcConfig extends WebMvcConfigurerAdapter {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
   */
  @Override public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * viewResolver.
   *
   * @return  InternalResourceViewResolver
   */
  @Bean public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/pages/");
    resolver.setSuffix(".jsp");

    return resolver;
  }


  @Override public void configureMessageConverters(final List<HttpMessageConverter<?>> messageConverters) {
    messageConverters.add(createXmlHttpMessageConverter());
    messageConverters.add(createJackson2Converter());

    super.configureMessageConverters(messageConverters);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  private MappingJackson2HttpMessageConverter createJackson2Converter() {
    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    converter.setObjectMapper(objectMapper());

    return converter;
  }


  private HttpMessageConverter<Object> createXmlHttpMessageConverter() {
    final MarshallingHttpMessageConverter xmlConverter = new MarshallingHttpMessageConverter();

    final XStreamMarshaller xstreamMarshaller = new XStreamMarshaller();
    xstreamMarshaller.setAnnotatedClasses(Wang.class);
    xstreamMarshaller.setStreamDriver(new XppDriver() {
      @Override public HierarchicalStreamWriter createWriter(Writer writer) {
        return new CDATAPrettyPrintWriter(writer);
      }
    });
    xmlConverter.setMarshaller(xstreamMarshaller);
    xmlConverter.setUnmarshaller(xstreamMarshaller);

    return xmlConverter;
  }

  private ObjectMapper objectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

    return objectMapper;
  }
} // end class WebMvcConfig
