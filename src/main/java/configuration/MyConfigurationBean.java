package com.poo2.springboot.poo2.configuration;

import com.poo2.springboot.poo2.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBeanImplement beanOperation(){
        return new MyBeanImplement();
    }
}