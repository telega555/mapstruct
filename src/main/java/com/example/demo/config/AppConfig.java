package com.example.demo.config;

import com.example.demo.mappers.MyMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyMapper myMapper() {
        return Mappers.getMapper(MyMapper.class);
    }
}

