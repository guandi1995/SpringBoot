package com.dguan.mybatis_plus.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dguan.mybatis_plus.pojo.PageHelper;
import com.dguan.mybatis_plus.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> fetchStudents();
    Page<Student> fetchStudentsByPage(PageHelper pageHelper);
    Page<Student> fetchStudentsByConditionByPage(PageHelper pageHelper);
    int insertStudent(Student student);
}
