package com.mall.system.Admin;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository repository;

    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    
    public AdminEntity saveAdmin(AdminEntity admin) {
        return repository.save(admin);
    }

    public List<AdminEntity> getAllAdmins() {
        return repository.findAll();
    }

    public AdminEntity login(String email, String password) {

        AdminEntity admin = repository.findByEmail(email);

        if (admin != null && admin.getPassword().equals(password)) {
            return admin;
        }
        return null;
    }

  
    public AdminEntity getAdminByEmail(String email) {
        return repository.findByEmail(email);
    }

    
    public AdminEntity updateAdmin(Long id, AdminEntity admin) {

        AdminEntity existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(admin.getName());
            existing.setEmail(admin.getEmail());
            return repository.save(existing);
        }
        return null;
    }

    public String deleteAdmin(Long id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Admin deleted successfully";
        } else {
            return "Admin not found";
        }
    }

   
    public String updateStatus(Long id) {

        AdminEntity admin = repository.findById(id).orElse(null);

        if (admin != null) {
            return "Admin Exists – Status Checked";
        }
        return "Admin Not Found";
    }
}























