package com.mall.system.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminEntity, Long> {

    AdminEntity findByEmail(String email);
}




















