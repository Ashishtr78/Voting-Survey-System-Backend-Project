package com.jspider.voting_surey_project.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NegativeOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Party {

	@Id
   private long id;
	
	private String name;
	
	
	private String condidateName;
	
	
	private int  noVote;
	
	
	
	@ManyToOne
    @JoinColumn(name = "consituency_id", referencedColumnName = "id") 
	private  Consituency consituency;
	

}
