package com.jspider.voting_surey_project.Entity.Repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jspider.voting_surey_project.Entity.Consituency;

import jakarta.transaction.Transactional;

public interface ConsituencyReprojetory extends JpaRepository<Consituency, Integer> {

	@Query("SELECT c.isElectionActive FROM Consituency c WHERE c.id = :id")
	public Boolean findStatus(@Param("id") int consituenceId);

	
	@Modifying
	@Transactional
	@Query(value = "UPDATE consituency SET is_election_active = 1, dols = :dols WHERE id = :id", nativeQuery = true)
	public int updateStatus(@Param("id") int consituenceId, @Param("dols") LocalDate date);


	

}
