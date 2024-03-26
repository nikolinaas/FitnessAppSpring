package org.unibl.etf.ip.fitnessappspring;

import org.apache.catalina.valves.rewrite.Substitution;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FitnessAppSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitnessAppSpringApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setAmbiguityIgnored(true);
        return mapper;
    }
}
