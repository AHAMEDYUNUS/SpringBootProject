package com.shoppingMallManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingMallManagement.entity.AdminService;
import com.shoppingMallManagement.repository.AdminRepository;

@RestController
public class AdminController {

	@Autowired
	private AdminRepository repo;
	
	@PostMapping("/admin")
	public AdminService newAdmin(@RequestBody AdminService a)  {
		return repo.save(a);
		
	}
	@GetMapping("/admin")
	public List<AdminService> getAdmin(){
		return repo.findAll();
	}
	@GetMapping("/admin/[id]")
	public AdminService getAdminById(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	
	@DeleteMapping("/admin/[id]")
	public void deleteAdmin(@PathVariable Long id) {
		repo.deleteById(id);
	}
	@PutMapping("/admin/[id]")
	public AdminService updateAdmin(@PathVariable Long  id, @RequestBody AdminService a) {
		a.setId(id);
		return repo.save(a);
	}
}
