package com.jspider.voting_surey_project.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.jspider.voting_surey_project.Dao.AdminDao;
import com.jspider.voting_surey_project.Entity.Admin;
import com.jspider.voting_surey_project.Entity.Consituency;
import com.jspider.voting_surey_project.Entity.Party;
import com.jspider.voting_surey_project.Entity.Voter;
import com.jspider.voting_surey_project.Entity.VotingDetail;
import com.jspider.voting_surey_project.Entity.Repository.VoterRepository;
import com.jspider.voting_surey_project.Service.AdminService;
import com.jspider.voting_surey_project.Service.ConsituencyServices;
import com.jspider.voting_surey_project.Service.PartyService;
import com.jspider.voting_surey_project.Service.VoterServices;
import com.jspider.voting_surey_project.Service.VotingDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/votingsurey")
public class Controller {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private VoterServices voterServices;
	
	@Autowired
	private ConsituencyServices consituencyService; 
	
	@Autowired
	private PartyService partyService;
	
	@Autowired
	private VotingDetailService votingDetailService;
      
	@GetMapping("/adminLogin")
	public String adminLogin(@RequestBody Admin admin) {

		return adminService.adminLogin(admin);
	}
	
	@GetMapping("/voterSignUp")
	public String voterSignUp(@RequestBody  Voter voter) {
		
		return   voterServices.saveVoterDetail(voter);
		
	}
	
	@GetMapping("/voterLogin")
	public String voterLogin(@RequestBody  Voter voter) {
		
		return   voterServices.voterLogin(voter);
		
	}
	
	@GetMapping("/saveConsituency")
	public String saveConsituency(@RequestBody  Consituency consituency) {
		
		System.out.println(consituency.getDOLS());
		
		return    consituencyService.saveConsituency(consituency);
		
	}
	
	@GetMapping("/findConsituency/{id}")
	public Consituency findConsituency(@PathVariable(name = "id") int id) {
		return    consituencyService.getConsituency(id);
		
	}
	
	
	@PostMapping("/addSuery")
	public String addSuery(@RequestBody  Party party) {
	   
		return    partyService.addSurey(party);
		
	}
	
	@PostMapping("/votingDetail")
	public String votingDetail(@RequestBody VotingDetail votingDetail) {
	   
		return  votingDetailService.incAndLockVoter(votingDetail)  ;
		
	}
	
	
	

}
