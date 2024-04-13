package com.Furnitures.spec.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Furnitures.spec.main.login.Login_Entity;
import com.Furnitures.spec.main.login.Login_Service;
@CrossOrigin("*")
@RestController
public class Controller {
	@Autowired
	Login_Service lgService;
	
	//Login_form
	@PostMapping("/add")
	public Login_Entity addUser(@RequestParam String email,String password) {
		return lgService.addNewUser(email,password);
	}
	
	//Register_form
	@GetMapping("/login")
	public String checkLogin(@RequestParam String email,String password) {
		return lgService.checkIsValidUser(email,password);
		//return "";
	}
	

}

