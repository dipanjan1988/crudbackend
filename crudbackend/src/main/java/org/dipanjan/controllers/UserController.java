package org.dipanjan.controllers;

import java.util.List;
import java.util.Optional;

import org.dipanjan.entities.User;
import org.dipanjan.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class UserController {
	
	@Autowired
	private UserRepository userrepository;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userrepository.findAll();
	}
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userrepository.findById(id);
	}
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		 userrepository.deleteById(id);;
		return true;
	}
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userrepository.save(user);
	}
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userrepository.save(user);
	}

}
