package com.example.jpa.Service;

import com.example.jpa.Entity.User;
import com.example.jpa.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class InitDbService {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init() {
		{
			User user = new User();
			user.setUsername("Demon");
			user.setPassword("123456");
			userRepository.save(user);
		}
		{
			User user = new User();
			user.setUsername("Tony");
			user.setPassword("123456");
			userRepository.save(user);
		}


	}
}
