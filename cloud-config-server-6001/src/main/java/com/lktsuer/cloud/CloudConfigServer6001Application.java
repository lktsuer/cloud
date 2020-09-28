package com.lktsuer.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 14641
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServer6001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServer6001Application.class, args);
    }

}
