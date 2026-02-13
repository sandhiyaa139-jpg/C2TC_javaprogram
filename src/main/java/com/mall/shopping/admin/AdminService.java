package com.mall.shopping.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public AdminEntity saveAdmin(AdminEntity admin) {
        return adminRepository.save(admin);
    }

    public List<AdminEntity> getAllAdmins() {
        return adminRepository.findAll();
    }
}