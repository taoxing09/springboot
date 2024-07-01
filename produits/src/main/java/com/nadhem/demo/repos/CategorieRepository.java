package com.nadhem.demo.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nadhem.demo.entities.Categorie;


	@Repository
	public interface CategorieRepository extends JpaRepository<Categorie, Long> {

	}
