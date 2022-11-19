package ua.edu.ucu.apps.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ApplicationConfig {
    @Bean
    public String getData() {
        return "Hello world";
    }
}
