package com.jspider.voting_surey_project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

	@Id
	private int id;
	private String email;
	private String password;

	public Admin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

}
