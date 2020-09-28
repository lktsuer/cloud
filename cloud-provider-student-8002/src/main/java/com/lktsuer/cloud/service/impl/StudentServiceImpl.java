package com.lktsuer.cloud.service.impl;

import com.lktsuer.cloud.mapper.StudentMapper;
import com.lktsuer.cloud.pojo.Student;
import com.lktsuer.cloud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @author: djh
 * @date: 2020/9/25 13:03
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;

    @Autowired
    private StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public List<Student> selectList() {
        return studentMapper.selectList(null);
    }

    @Override
    public Student selectById(Integer id) {
        return studentMapper.selectById(id);
    }
}
