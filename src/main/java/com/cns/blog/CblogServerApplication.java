package com.cns.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:site.properties")
public class CblogServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CblogServerApplication.class, args);
    }

}
