package com.example.League;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginInterface extends JpaRepository<Login,String>{
	
	@Query("from Login")
	public List<Login> findAll();

}
