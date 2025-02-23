package com.jspider.voting_surey_project.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.voting_surey_project.Entity.Admin;
import com.jspider.voting_surey_project.Entity.Repository.AdminRepository;

@Repository
public class AdminDao {

	@Autowired
	private AdminRepository adminRepository;

	public Admin adminLoginDao(String email) {
		Optional<Admin> adminOptional = adminRepository.findByEmail(email);
		if (adminOptional.isPresent()) {
			Admin admin = adminOptional.get();
			System.out.println(admin.getId());
			return admin;
		} else {
			System.out.println("Admin not found!");
			return null;
		}

	}
}
