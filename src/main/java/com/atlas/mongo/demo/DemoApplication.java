package com.atlas.mongo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.atlas.mongo.demo.model.User;
import com.atlas.mongo.demo.repositories.UserRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	private UserRepository userRepository;
	
	@Autowired
	public DemoApplication(UserRepository userRepo) {
		this.userRepository = userRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		if(userRepository.findAll().isEmpty()) {
			userRepository.insert(new User("Alice","Smith","smith@gmail.com"));
			userRepository.insert(new User("Vin","Smith","sim@gmail.com"));
			userRepository.insert(new User("Vineet","Smith","smi@gmail.com"));
		}
		
		for (User user: userRepository.findAll()) {
			System.out.println(user.getFirstName());
		}
		
	}

}
