package com.example.products;

import com.example.products.entity.AppUser;
import com.example.products.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

	@Autowired
	private AppUserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new AppUser("admin", passwordEncoder.encode("pwd123"), "ROLE_ADMIN"));
		userRepository.save(new AppUser("user", passwordEncoder.encode("pwd123"), "ROLE_USER"));
	}
}
