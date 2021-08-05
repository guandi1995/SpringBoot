package com.dguan.mybatis_plus.controller;

import com.dguan.mybatis_plus.pojo.Student;
import com.dguan.mybatis_plus.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Di Guan on 8/5/2021 11:16 AM
 */

@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> fetchStudents(){
        return studentService.fetchStudents();
    }
}
