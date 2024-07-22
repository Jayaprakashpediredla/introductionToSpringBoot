package com.codingshuttle.prakash.week1Intro.introductionToSprintBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class classConfig {

    @Bean
    Apple getApple(){
        return new Apple();
    }
}
