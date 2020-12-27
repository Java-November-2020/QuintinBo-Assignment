package com.quintinbowman.TaskExam.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quintinbowman.TaskExam.models.User;
@Repository
//Builds the model in the database, talk to the Service.
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
	boolean existsByEmail(String email);
	User findByEmail(String email);
	boolean existsById(Long id);
	Optional<User> findById(Long id);
}
