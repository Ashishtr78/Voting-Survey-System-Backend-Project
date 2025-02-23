package com.jspider.voting_surey_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.voting_surey_project.Dao.PartyDao;
import com.jspider.voting_surey_project.Entity.Party;

@Service
public class PartyService {

	@Autowired
	private PartyDao partyDao;

	@Autowired
	private ConsituencyServices consituencyServices;

	public String addSurey(Party party) {
      
		String res = consituencyServices.updateStatus(party.getConsituency().getId());
		System.out.println(res);
		

			Party party1 = partyDao.addSuery(party);
			if (party1 != null)
				return "surey add successfully";
			else
				return "suery not added successfully";
	
		
		
	}

}
