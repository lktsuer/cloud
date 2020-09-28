package com.lktsuer.cloud;

import com.lktsuer.cloud.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CloudProviderStudent8001ApplicationTests {

    @Autowired
    StudentMapper studentMapper;

    @Test
    void contextLoads() {
        System.out.println(studentMapper.selectList(null));
    }

}
