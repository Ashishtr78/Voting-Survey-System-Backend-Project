package com.jspider.voting_surey_project.Entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jspider.voting_surey_project.Entity.Party;

import jakarta.transaction.Transactional;

public interface PartyReprository extends JpaRepository<Party, Integer> {

	@Modifying
	@Transactional
	@Query(value = "update party set no_vote=(no_vote+1) where id=?1",nativeQuery = true)
	int updateVoteCount(long partyId);

}
