package com.example.democonfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Configuration
@PropertySource("application-${spring.profiles.active}.properties")
@ConfigurationProperties(prefix = "config")
@Validated
public class ConfigProperties {
    private String mongo;

    public String getMongo() {
        return mongo;
    }

    public void setMongo(String mongo) {
        this.mongo = mongo;
    }
}