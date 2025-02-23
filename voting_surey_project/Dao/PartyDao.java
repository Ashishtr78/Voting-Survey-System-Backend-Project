package com.jspider.voting_surey_project.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.voting_surey_project.Entity.Party;
import com.jspider.voting_surey_project.Entity.Repository.PartyReprository;

@Repository
public class PartyDao  {

	@Autowired
	private PartyReprository partyReprository;
	
	public Party addSuery(Party party) {
		 
	Party party1=	partyReprository.save(party);
		return party1;
	}

	

	public String noOfVoteInc(long partyId) {
	int res=partyReprository.updateVoteCount(partyId);
	System.out.println(res);
		return "ok";
	}

}
