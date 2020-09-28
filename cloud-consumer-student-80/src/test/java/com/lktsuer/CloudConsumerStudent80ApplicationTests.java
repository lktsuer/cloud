package com.lktsuer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;

import java.util.List;

@SpringBootTest
class CloudConsumerStudent80ApplicationTests {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;
    @Test
    void contextLoads() {

        System.out.println(restTemplateBuilder.build().getForObject("http://localhost:8001/student/selectList", List.class));
    }

}
