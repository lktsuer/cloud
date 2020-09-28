package com.lktsuer.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 14641
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConsumerStudent80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerStudent80Application.class, args);
    }

}
