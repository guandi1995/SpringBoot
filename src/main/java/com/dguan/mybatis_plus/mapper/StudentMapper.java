package com.dguan.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dguan.mybatis_plus.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * extends继承Mybatis-plus中的BaseMapper<?>
 * 单表的CRUD操作都解决了
 * 根据需求在该mapper interface中添加方法，例如两表联查
 */

public interface StudentMapper extends BaseMapper<Student> {

}
