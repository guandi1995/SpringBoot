package com.dguan.mybatis_plus.service;

import com.dguan.mybatis_plus.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> fetchStudents();
}
