package com.Furnitures.spec.main.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Login_Repo extends JpaRepository<Login_Entity ,String> {
	Login_Entity findByEmail(String name);


}
