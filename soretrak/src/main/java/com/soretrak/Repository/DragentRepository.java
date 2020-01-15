package com.soretrak.Repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soretrak.model.Dragent;

public interface DragentRepository extends JpaRepository<Dragent,Long> {

	//List<Dragent> findByPrenomLikeIgnoreCase(String nom);
	List<Dragent> findByPrenomLikeIgnoreCaseOrderByMatric(String nom);
	//List<Dragent> findByNomAndPrenom(String nom , String prenom);
	
	
	@Query(value ="select * from dragent_test a where a.matric=?1 and a.prenom like '%A%'", nativeQuery = true)
	Dragent findByMatric1122(Long matric);
	
	
	
	
	
	
	
}
