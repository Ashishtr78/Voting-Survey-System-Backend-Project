package com.jspider.voting_surey_project.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.voting_surey_project.Entity.Voter;
import com.jspider.voting_surey_project.Entity.Repository.VoterRepository;

@Repository
public class VoterDao {

	@Autowired
	private VoterRepository voterRepository;

	public String saveVoterDetail(Voter voter) {

		Voter voter1 = voterRepository.save(voter);
		if (voter1 != null) {
			
			return "voter data saved successfully";
		} else {
			return "voter data not saved successfully";
		}

	}

	public Optional<Voter> getVoterDetailById(int voterId) {

		return voterRepository.findById(voterId);
		
	

	}

	public boolean checkVoter(int voterId) {
		boolean isVote=voterRepository.getIsVote(voterId);
		System.out.println(isVote);
		return isVote;
	}

	public Boolean updateIsVote(int voterId) {
		int  isVote=voterRepository.updateIsVote(voterId);
		if(isVote==1)
		return true ;
		else
			return false;
	}

}
