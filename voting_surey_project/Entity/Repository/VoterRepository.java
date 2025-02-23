package com.jspider.voting_surey_project.Entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jspider.voting_surey_project.Entity.Voter;

import jakarta.transaction.Transactional;

public interface VoterRepository extends JpaRepository<Voter, Integer>{

	@Query(value = "select is_voted from voter where voter_id=?1",nativeQuery = true)
	boolean getIsVote(int voterId);

	@Transactional
	@Modifying
	@Query(value = "update voter set is_voted=1 where voter_id=?1",nativeQuery = true)
	int updateIsVote(int voterId);

}
