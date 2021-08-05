package com.dguan.test.controller;

import com.dguan.test.pageHelper.Page;
import com.dguan.test.pojo.Admin;
import com.dguan.test.service.AdminService;
//import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Di Guan on 8/4/2021 12:45 PM
 */

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * 没有分页的查询所有
     * @return
     */
    @RequestMapping("/hello")
    public List<Admin> hello(){
        return adminService.fetchAdmins();
    }

    /**
     * 分页查询
     * @param currentPage
     * @param count
     * @return
     */
//    @GetMapping(value = "/{currentPage}/{count}")
//    public PageInfo<Admin> fetchByPage(@PathVariable("currentPage") Integer currentPage,
//                                 @PathVariable("count") Integer count){
//        Page page = new Page();
//        page.setCurrentPage(currentPage);
//        page.setCount(count);
//        return adminService.fetchAdminsByPage(page);
//    }
}
