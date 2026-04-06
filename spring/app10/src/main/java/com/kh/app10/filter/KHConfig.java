package com.kh.app10.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KHConfig {
    @Bean
    public FilterRegistrationBean bean() {
        KHFilter khFilter = new KHFilter();
        FilterRegistrationBean x = new FilterRegistrationBean(khFilter);
        x.addUrlPatterns("/*");
        x.setOrder(1);
        return x;
    }
}
