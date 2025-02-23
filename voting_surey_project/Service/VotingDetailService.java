package com.jspider.voting_surey_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.voting_surey_project.Dao.PartyDao;
import com.jspider.voting_surey_project.Entity.VotingDetail;

@Service
public class VotingDetailService {
	
	
	
	@Autowired
	private VoterServices voterServices;

	public String incAndLockVoter(VotingDetail votingDetail) {
		
		  long partyId=votingDetail.getPartyId();
		  int VoterId=votingDetail.getVoterId();
		  String msg=voterServices.checkVoter(VoterId,partyId);
		
		  return "ok";
	}

}
