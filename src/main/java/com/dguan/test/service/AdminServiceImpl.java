package com.dguan.test.service;

import com.dguan.test.mapper.AdminMapper;
import com.dguan.test.pageHelper.Page;
import com.dguan.test.pojo.Admin;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Di Guan on 8/4/2021 12:54 PM
 */
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Admin> fetchAdmins() {
        return adminMapper.fetchAdmins();
    }

    /**
     * 分页查询
     * @param page
     * @return
     */
//    @Override
//    public PageInfo<Admin> fetchAdminsByPage(Page page) {
//        //指明当前页，和每页多少条数据
//        PageHelper.startPage(page.getCurrentPage(), page.getCount());
//        //查询所有数据
//        List<Admin> admins = adminMapper.fetchAdmins();
//        //新建PageInfo,将admins参数传递到有参构造中
//        PageInfo<Admin> adminPageInfo = new PageInfo<>(admins);
//        return adminPageInfo;
//    }
}
