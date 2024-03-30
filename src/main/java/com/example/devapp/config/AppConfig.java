package com.example.devapp.config;

import com.example.devapp.profile.SystemProfile;
import com.example.devapp.profile.impl.DevProfile;
import com.example.devapp.profile.impl.ProductionProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @ConditionalOnProperty("netology.profile.dev")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty("netology.profile.prod")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
