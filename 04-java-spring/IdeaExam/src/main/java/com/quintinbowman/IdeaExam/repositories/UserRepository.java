package com.quintinbowman.IdeaExam.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quintinbowman.IdeaExam.models.User;
@Repository
//Creates the object in the database from the User model, Talks to Services
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
	boolean existsByEmail(String email);
	User findByEmail(String email);
}
