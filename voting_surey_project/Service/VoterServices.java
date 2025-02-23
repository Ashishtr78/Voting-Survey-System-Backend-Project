package com.jspider.voting_surey_project.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.voting_surey_project.Dao.PartyDao;
import com.jspider.voting_surey_project.Dao.VoterDao;
import com.jspider.voting_surey_project.Entity.Voter;

@Service
public class VoterServices {

	@Autowired
	private VoterDao voterDao;
	
	@Autowired
	private PartyDao partyDao;

	public String saveVoterDetail(Voter voter) {
		LocalDate dob = voter.getDob();
		LocalDate today = LocalDate.now();
		Period age = Period.between(dob, today);
		int years = age.getYears();
		if (years >= 18) {

			String res = voterDao.saveVoterDetail(voter);
			return res;

		} else {
			return "age is not valid";
		}

	}

	public String voterLogin(Voter voter) {

		Optional<Voter> opt = voterDao.getVoterDetailById(voter.getVoterId());

		Voter voter1 = opt.get();

		if (voter.getVoterId() == voter1.getVoterId() && voter.getPassword().equals(voter1.getPassword())) {

			return "voter login successfuly";
		} else {

			return "voter login is not successfully";
		}

	}

	public String checkVoter(int voterId,long partyId) {
	boolean check=	voterDao.checkVoter(voterId);
	  if(check==false) {
		Boolean c=  voterDao.updateIsVote(voterId);
		  String status=partyDao.noOfVoteInc(partyId);
		  return "update";
	  }
	    return"you already give vote";
	  
		
	}

}
