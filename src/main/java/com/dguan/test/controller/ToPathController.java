package com.dguan.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Di Guan on 8/4/2021 2:54 PM
 */
@Controller
public class ToPathController {
    @RequestMapping("/fetch")
    public String fetch(){
        return "test/fetchAdmins";
    }
}
