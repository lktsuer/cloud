package com.lktsuer.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 14641
 */
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class CloudProviderStudent8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderStudent8002Application.class, args);
    }
}
