package com.dguan.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dguan.mybatis_plus.pojo.Student;

/**
 * extends继承Mybatis-plus中的BaseMapper<?>
 * 单表的CRUD操作都解决了
 * 根据需求在该mapper interface中添加方法，例如两表联查
 */
public interface StudentMapper extends BaseMapper<Student> {
}
