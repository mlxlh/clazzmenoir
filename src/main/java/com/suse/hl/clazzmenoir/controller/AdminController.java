package com.suse.hl.clazzmenoir.controller;

import com.suse.hl.clazzmenoir.common.domain.Admin;
import com.suse.hl.clazzmenoir.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping
    public String loginSkip(){
        return "/admin/admin-login";
    }
    @PostMapping("/login")
    public String login(String adminName,String password){
        Admin admin=adminService.selectByName(adminName);
        //System.out.println(admin.getAdminName());
        //System.out.println(admin.getAdminPassword());
        if (admin==null){
            //System.out.println("用户名");
            return "/admin/admin-login";
        }else {
            if (admin.getAdminPassword().equals(password)){
                //System.out.println("登程");
                return "/clazz/clazz-list";
            }else{
                //System.out.println("密码");
                return "/admin/admin-login";
            }
        }
    }

}
