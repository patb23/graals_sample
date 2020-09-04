package com.example.demo.serverless;

import com.example.demo.beans.Bar;
import com.example.demo.beans.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.FunctionType;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.messaging.Message;

import java.util.function.Function;

// https://cloud.spring.io/spring-cloud-static/spring-cloud-function/2.1.0.M1/aws.html#_functional_bean_definitions

@SpringBootApplication
public class ServerlessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerlessApplication.class, args);
    }

    @Bean
    public Function<Foo, Bar> uppercase() {
        return foo -> Bar.builder().result(foo.getValue()).build();
    }


//    @Override
//    public void initialize(GenericApplicationContext applicationContext) {
//        applicationContext.registerBean("upperCase", FunctionRegistration.class,
//                () -> new FunctionRegistration<Function<Foo, Bar>>(uppercase())
//                        .type(FunctionType.from(Foo.class)
//                                .to(Bar.class).getType()));
//    }
}


