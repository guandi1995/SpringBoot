package com.dguan.test.mapper;

import com.dguan.test.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AdminMapper {
    List<Admin> fetchAdmins();
}
