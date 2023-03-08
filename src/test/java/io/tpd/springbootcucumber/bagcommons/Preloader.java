package io.tpd.springbootcucumber.bagcommons;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Preloader {

    public Preloader() {
        log.info("I should load only once before startup!");
    }

    @Bean
    String myBean(){
        return "this is the string that should get injected";
    }

}
