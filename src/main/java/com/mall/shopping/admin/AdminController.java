package com.mall.shopping.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/save")
    public AdminEntity saveAdmin(@RequestBody AdminEntity admin) {
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/all")
    public List<AdminEntity> getAllAdmins() {
        return adminService.getAllAdmins();
    }
}