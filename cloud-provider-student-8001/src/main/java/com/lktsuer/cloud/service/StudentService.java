package com.lktsuer.cloud.service;

import com.lktsuer.cloud.mapper.StudentMapper;
import com.lktsuer.cloud.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * @author: djh
 * @date: 2020/9/25 13:02
 */
public interface StudentService {

    int insert(Student student);

    List<Student> selectList();

    Student selectById(Integer id);
}
