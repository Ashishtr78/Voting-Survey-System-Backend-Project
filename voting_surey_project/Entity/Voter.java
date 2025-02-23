package com.jspider.voting_surey_project.Entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Voter {
	
	@Id
	private int voterId;
	private String name;
	private long mobileNo;
	private LocalDate dob;
	
	private String gender;
	private String state;
	private String distric;
	private int constituencyNumber;
	private String password;
	private int pincode;
	private boolean isVoted;
	public Voter(int voterId, String password) {
		super();
		this.voterId = voterId;
		this.password = password;
	}
	

}
