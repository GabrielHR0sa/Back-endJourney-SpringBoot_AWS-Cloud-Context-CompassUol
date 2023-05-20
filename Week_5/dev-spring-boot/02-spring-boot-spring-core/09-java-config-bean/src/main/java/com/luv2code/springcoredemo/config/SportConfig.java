package com.luv2code.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;

//configurando o bean para o swimCoach
// o mesmo não possui o @Component
@Configuration
public class SportConfig {
    
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
