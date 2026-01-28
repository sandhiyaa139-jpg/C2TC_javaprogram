package com.mall.system.Admin;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

   
    @PostMapping("/save")
    public AdminEntity saveAdmin(@RequestBody AdminEntity admin) {
        return service.saveAdmin(admin);
    }

    @GetMapping("/all")
    public List<AdminEntity> getAllAdmins() {
        return service.getAllAdmins();
    }

   
    @PostMapping("/login")
    public String login(@RequestBody AdminEntity admin) {

        AdminEntity result =
                service.login(admin.getEmail(), admin.getPassword());

        return (result != null)
                ? "Login Successful"
                : "Invalid Credentials";
    }

   
    @GetMapping("/profile/{email}")
    public AdminEntity getAdminProfile(@PathVariable String email) {
        return service.getAdminByEmail(email);
    }

  
    @PutMapping("/update/{id}")
    public AdminEntity updateAdmin(
            @PathVariable Long id,
            @RequestBody AdminEntity admin) {
        return service.updateAdmin(id, admin);
    }

    @PutMapping("/status/{id}")
    public String updateStatus(@PathVariable Long id) {
        return service.updateStatus(id);
    }
  
    @DeleteMapping("/delete/{id}")
    public String deleteAdmin(@PathVariable Long id) {
        return service.deleteAdmin(id);
    }
}

































