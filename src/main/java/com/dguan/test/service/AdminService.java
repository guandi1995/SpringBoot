package com.dguan.test.service;

import com.dguan.test.pageHelper.Page;
import com.dguan.test.pojo.Admin;
//import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AdminService {
    List<Admin> fetchAdmins();
//    PageInfo<Admin> fetchAdminsByPage(Page page);
}
