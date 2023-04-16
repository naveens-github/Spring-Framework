package com.myproject.Scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.myproject.Scopes")//Just this annotation is enough to load the beans
public class BeanConfig {
    //we can also load the beans without @ComponentScan as follows. We can remove @Component from Doctor class as well
    @Bean
    public Doctor doctor(){
        return new Doctor();
    }
}
