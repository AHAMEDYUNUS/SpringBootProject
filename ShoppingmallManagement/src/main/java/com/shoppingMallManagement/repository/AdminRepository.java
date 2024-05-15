package com.shoppingMallManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingMallManagement.entity.AdminService;
@Repository
public interface AdminRepository extends JpaRepository<AdminService, Long>{

}
