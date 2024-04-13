package com.Furnitures.spec.main.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login_Service {

	@Autowired
	Login_Repo lgRepo;

	public String checkIsValidUser(String email, String password) {
		Login_Entity lgUser = lgRepo.findByEmail(email);
		if ((lgUser != null) && (lgUser.getPassword().equalsIgnoreCase(password))) {
			return "success";
		}
		return "failure";
	}

	public Login_Entity addNewUser(String email, String password) {
		Login_Entity lgUser = new Login_Entity(email,password);
		return lgRepo.save(lgUser);
	}
}
