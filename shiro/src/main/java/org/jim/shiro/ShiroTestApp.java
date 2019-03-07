package org.jim.shiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ShiroTestApp {
    public static void main(String[] args) {
        SpringApplication.run(ShiroTestApp.class, args);
    }
}
