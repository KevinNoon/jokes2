package com.kevin.noon.jokes2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class Jokes2Application {

    public static void main(String[] args) {
        SpringApplication.run(Jokes2Application.class, args);
    }

}
