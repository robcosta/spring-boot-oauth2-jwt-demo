package com.devsuperior.demo;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication {//implements CommandLineRunner{

//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("ENCODE = " + passwordEncoder.encode("123456"));
//		System.out.println("ENCODE = " + passwordEncoder.encode("123456"));
//		System.out.println("ENCODE = " + passwordEncoder.encode("PRF-1188"));
//		
//		boolean result1 = passwordEncoder.matches("123456", "$2a$10$Adpk5tdO8yFkIX.6IspH.OTF0dOxx2D9kx3drL6q4/1uLhoB/Ahze");
//		boolean result2 = passwordEncoder.matches("122456", "$2a$10$Adpk5tdO8yFkIX.6IspH.OTF0dOxx2D9kx3drL6q4/1uLhoB/Ahze");
//		boolean result3 = passwordEncoder.matches("123456", "$2a$10$efAKHcdzfnBwg5yCvuiOMeiu8pB6TuvNayPjVAZpopc1Ijx95Wyu2");
//		
//		System.out.println("RESULT1 - TRUE: " + result1);
//		System.out.println("RESULT2 - FALSE: " + result2);
//		System.out.println("RESULT3 - TRUE: " + result3);
//		
//	}

}
