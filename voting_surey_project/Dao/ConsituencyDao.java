package com.jspider.voting_surey_project.Dao;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.voting_surey_project.Entity.Consituency;
import com.jspider.voting_surey_project.Entity.Repository.ConsituencyReprojetory;

@Repository
public class ConsituencyDao {

	@Autowired
	private ConsituencyReprojetory consituencyReprojetory;
	
	
	public void saveConsituency(Consituency consituency) {
		
		consituencyReprojetory.save(consituency);
		
	}


	public boolean checkStatus(int consituenceId) {
		
	   boolean k= consituencyReprojetory.findStatus(consituenceId);
		
		
		return k;
	}


	public int updateStatus(int constituencyId,LocalDate date) {
		
	return	consituencyReprojetory.updateStatus(constituencyId,date);
	}


	public Optional<Consituency> getConsituency(int id) {
		
		return consituencyReprojetory.findById(id);
	}
	
	

}
