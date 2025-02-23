package com.jspider.voting_surey_project.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.voting_surey_project.Dao.AdminDao;
import com.jspider.voting_surey_project.Dao.VoterDao;
import com.jspider.voting_surey_project.Entity.Admin;
import com.jspider.voting_surey_project.Entity.Voter;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;


	public String adminLogin(Admin admin) {

		Admin admin2 = adminDao.adminLoginDao(admin.getEmail());
		if (admin2.getEmail().equalsIgnoreCase(admin.getEmail())) {
			if (admin2.getPassword().equalsIgnoreCase(admin.getPassword())) {
				System.out.println(admin2.getId());
				return "login successfuly";
			} else {
				return "password is incorrect";
			}

		} else {
			return "email is incorrect";
		}

	}

	

}
