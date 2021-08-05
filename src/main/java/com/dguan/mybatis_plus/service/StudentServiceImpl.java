package com.dguan.mybatis_plus.service;

import com.dguan.mybatis_plus.mapper.StudentMapper;
import com.dguan.mybatis_plus.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Di Guan on 8/5/2021 11:14 AM
 */

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> fetchStudents() {
        List<Student> students = studentMapper.selectList(null);
        System.out.println(students);
        return students;
    }
}
