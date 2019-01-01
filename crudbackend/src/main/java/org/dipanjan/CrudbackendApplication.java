package org.dipanjan;

import org.dipanjan.entities.User;
import org.dipanjan.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CrudbackendApplication extends SpringBootServletInitializer implements CommandLineRunner {
	
	@Autowired
	private UserRepository userrepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudbackendApplication.class, args);
	}

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(CrudbackendApplication.class);
	    }
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userrepository.save(new User("one", "one"));
		userrepository.save(new User("two", "two"));
		userrepository.save(new User("three", "three"));
		
	}
}
