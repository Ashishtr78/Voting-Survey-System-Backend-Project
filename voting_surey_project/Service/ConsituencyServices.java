package com.jspider.voting_surey_project.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.voting_surey_project.Dao.ConsituencyDao;
import com.jspider.voting_surey_project.Entity.Consituency;

@Service
public class ConsituencyServices {

	@Autowired
	private ConsituencyDao consituencyDao;

	public String saveConsituency(Consituency consituency) {

		consituencyDao.saveConsituency(consituency);
		return null;
	}

	public boolean checkStatus(int consituenceId) {

		return consituencyDao.checkStatus(consituenceId);
	}

	public String updateStatus(int constituencyId) {

		LocalDate date = LocalDate.now();

		boolean check = consituencyDao.checkStatus(constituencyId);
		if (check != true) {
			int c = consituencyDao.updateStatus(constituencyId, date);
             System.out.println("3");
			return "Ok";

		} else {
			System.out.println("8");
			return "already on";
		}

	}

	public Consituency getConsituency(int id) {

		Optional<Consituency> opt = consituencyDao.getConsituency(id);
		return opt.get();
	}

}
