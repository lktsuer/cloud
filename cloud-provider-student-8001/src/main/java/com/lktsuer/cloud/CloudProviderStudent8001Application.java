package com.lktsuer.cloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author 14641
 */
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class CloudProviderStudent8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderStudent8001Application.class, args);
    }

    @Bean
    public ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean(){
        ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean = new ServletRegistrationBean<>(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }



}
