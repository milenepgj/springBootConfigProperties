package com.example.democonfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Democonfig2Application {


    @Autowired
    private ConfigProperties configProperties;


    @Bean
    public MyBean myBean() {
        MyBean myBean = new MyBean();
        myBean.setName(configProperties.getMongo());
        return myBean;
    }

	public static void main(String[] args) {
		SpringApplication.run(Democonfig2Application.class, args);
	}
}
