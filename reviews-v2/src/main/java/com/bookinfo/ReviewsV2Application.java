package com.bookinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReviewsV2Application {

    public static void main(String[] args) {
        SpringApplication.run(ReviewsV2Application.class, args);
    }

}
