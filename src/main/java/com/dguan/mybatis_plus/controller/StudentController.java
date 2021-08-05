package com.dguan.mybatis_plus.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dguan.mybatis_plus.pojo.PageHelper;
import com.dguan.mybatis_plus.pojo.Student;
import com.dguan.mybatis_plus.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * 没有分页的查询所有
     * @return
     */
    @GetMapping
    public List<Student> fetchStudents(){
        return studentService.fetchStudents();
    }

    /**
     * 分页查询所有
     * @param currentPage
     * @param count
     * @return
     */
    @GetMapping(value = "/{pageNum}/{count}")
    public Page<Student> fetchStudentsByPage(@PathVariable("pageNum") Integer currentPage,
                                             @PathVariable("count") Integer count){
        PageHelper pageHelper = new PageHelper();
        pageHelper.setCurrentPage(currentPage);
        pageHelper.setCount(count);
        return studentService.fetchStudentsByPage(pageHelper);
    }

    /**
     * 检索分页查询
     * @param currentPage
     * @param count
     * @return
     */
    @GetMapping(value = "condition/{pageNum}/{count}")
    public Page<Student> fetchStudentsByConditionByPage(@PathVariable("pageNum") Integer currentPage,
                                             @PathVariable("count") Integer count){
        PageHelper pageHelper = new PageHelper();
        pageHelper.setCurrentPage(currentPage);
        pageHelper.setCount(count);
        return studentService.fetchStudentsByConditionByPage(pageHelper);
    }

    @RequestMapping("/insertStu")
    public int insertStudent(){
        Student student = new Student();
//        student.setId(21);
        student.setName("meimei");
        student.setAge(10);
        student.setGender("FeMale");
        student.setMajor_id(2);
        return studentService.insertStudent(student);
    }
}
