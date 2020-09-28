package com.lktsuer.cloud.controller;

import com.lktsuer.cloud.pojo.Student;
import com.lktsuer.cloud.service.StudentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: djh
 * @date: 2020/9/25 13:06
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/selectList")
    @HystrixCommand(fallbackMethod = "selectListHystrix")
    public List<Student> selectList(){
        return studentService.selectList();
    }
    public List<Student> selectListHystrix(){
        List<Student> list = new ArrayList<>();
        list.add(new Student().setDbSource("NONE"));
        return list ;
    }


    @GetMapping("/selectOne/{id}")
    @HystrixCommand(fallbackMethod = "selectByIdHystrix")
    public Student selectById(@PathVariable Integer id){
        return studentService.selectById(id);
    }
    public Student selectByIdHystrix(@PathVariable Integer id){
        return new Student().setDbSource("NONE");
    }


    @PostMapping("/insert")
    @HystrixCommand(defaultFallback = "insertHystrix")
    public int insert(Student student){
        return studentService.insert(student);
    }
    public int insertHystrix(Student student){
        return 0;
    }

}
