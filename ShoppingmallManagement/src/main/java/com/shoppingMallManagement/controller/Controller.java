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

import com.shoppingMallManagement.entity.Admin;
import com.shoppingMallManagement.repository.AdminRepository;

@RestController
public class Controller {

	@Autowired
	private AdminRepository repo;
	
	@PostMapping("/admin")
	public Admin newAdmin(@RequestBody Admin a)  {
		return repo.save(a);
		
	}
	@GetMapping("/admin")
	public List<Admin> getAdmin(){
		return repo.findAll();
	}
	@GetMapping("/admin/[id]")
	public Admin getAdminById(@PathVariable Long id) {
		return repo.findById(id).get();
	}
	
	@DeleteMapping("/admin/[id]")
	public void deleteAdmin(@PathVariable Long id) {
		repo.deleteById(id);
	}
	@PutMapping("/admin/[id]")
	public Admin updateAdmin(@PathVariable Long  id, @RequestBody Admin a) {
		a.setId(id);
		return repo.save(a);
	}
}
