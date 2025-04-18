package com.smart.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.Entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	@Query("select u from User u where u.email= :email")
	public User getUserByUserName(@Param("email") String email);

	public Optional<User> getById(int cid);

}
