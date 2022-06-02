package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

public	Admin findByAdminName(String adminName);

public Admin findByAdminPassword(String adminPassword);

public Admin findByAdminEmailId(String adminEmailId);

public Admin findByAdminAccomodationType(String adminAccomodationType);

public Admin findByAdminPackage(Float adminPackage);

public Admin findByAdminRoomType(String adminRoomType);

}
