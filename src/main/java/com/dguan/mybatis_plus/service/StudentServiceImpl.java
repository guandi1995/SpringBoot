package com.dguan.mybatis_plus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dguan.mybatis_plus.mapper.StudentMapper;
import com.dguan.mybatis_plus.pojo.PageHelper;
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

    /**
     * 没有分页的查询所有
     * @return
     */
    @Override
    public List<Student> fetchStudents() {
        List<Student> students = studentMapper.selectList(null);
        System.out.println(students);
        return students;
    }

    /**
     * 分页查询所有
     * @param pageHelper
     * @return
     */
    @Override
    public Page<Student> fetchStudentsByPage(PageHelper pageHelper) {
        Page<Student> page = new Page<>(pageHelper.getCurrentPage(), pageHelper.getCount());
        Page<Student> studentPage = studentMapper.selectPage(page, null);
        return studentPage;
    }

    /**
     * 分页检索查询，使用Wrapper
     * @param pageHelper
     * @return
     */
    @Override
    public Page<Student> fetchStudentsByConditionByPage(PageHelper pageHelper) {
        Page<Student> page = new Page<>(pageHelper.getCurrentPage(), pageHelper.getCount());
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("age", 20);
        queryWrapper.le("age", 30);
        Page<Student> studentPage = studentMapper.selectPage(page,queryWrapper);
        return studentPage;
    }

    /**
     * 新增数据
     * @param student
     * @return
     */
    @Override
    public int insertStudent(Student student) {
        return studentMapper.insert(student);
    }

}
