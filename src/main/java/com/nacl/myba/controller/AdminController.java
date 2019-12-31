package com.nacl.myba.controller;

import com.nacl.myba.bean.Admin;
import com.nacl.myba.mapper.AdminMapper;
import com.nacl.myba.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("getAdminById")
    public Admin getAdminById(String id){
        Long iid = 190101L;
        if(id != "" && id != null){
            iid = Long.parseLong(id);
        }
        return adminService.getAdminById(iid);
    }
}
