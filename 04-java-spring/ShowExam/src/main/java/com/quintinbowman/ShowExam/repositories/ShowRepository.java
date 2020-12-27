package com.quintinbowman.ShowExam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quintinbowman.ShowExam.models.Show;

@Repository
//Builds the model in the database, talk to the Service.
public interface ShowRepository extends CrudRepository<Show, Long> {
	List<Show>findAll();
}
