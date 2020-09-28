package com.lktsuer.cloud.controller;

import com.lktsuer.cloud.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: djh
 * @date: 2020/9/25 16:00
 */
@RestController
@RequestMapping("/consumer/student")
public class StudentConsumerController {
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://CLOUD-PROVIDER-STUDENT";
    @Autowired
    public StudentConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/selectList")
    public List<Student> selectList() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/selectList", List.class);
    }

    @GetMapping("/selectOne/{id}")
    public Student selectById(@PathVariable Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/selectOne/" + id, Student.class);
    }

    @PostMapping("/insert")
    public Student selectById(Student student) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/student/insert", student, Student.class);
    }
}



