package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT obj "
			+ "FROM User obj "
			+ "JOIN FETCH obj.roles "
			+ "WHERE obj.email = :email")
	User searchUserAndRolesByEmail(String email);
}
