package com.darshantandel.bookseller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${sprint.profiles.active:default}.properties")
public class BookSellerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSellerApplication.class, args);
    }
}
