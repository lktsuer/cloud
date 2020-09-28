package com.lktsuer.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 14641
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerStudentHystrixDashboard9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerStudentHystrixDashboard9001Application.class, args);
    }

}
