package com.souhancir_voitures.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souhancir_voitures.entities.Marque;

public interface MarqueRepository extends JpaRepository<Marque, Long> {
	

}
