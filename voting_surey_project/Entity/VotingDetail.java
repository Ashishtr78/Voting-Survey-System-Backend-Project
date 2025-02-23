package com.jspider.voting_surey_project.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VotingDetail {
	
	
    private int id;
	private int voterId;
	private long partyId;
	
	

}
