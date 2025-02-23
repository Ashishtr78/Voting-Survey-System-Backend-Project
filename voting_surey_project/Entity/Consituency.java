package com.jspider.voting_surey_project.Entity;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.cglib.core.Local;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NegativeOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consituency {
	
	@Id
	private int id;
	
	private String name;
	
	
	private String State;
	
	private boolean isElectionActive;
	
	

    @JsonFormat(pattern = "yyyy-MM-dd") 
    @Column(name = "dols", columnDefinition = "DATE") 
    private LocalDate dOLS;
	
	

}
