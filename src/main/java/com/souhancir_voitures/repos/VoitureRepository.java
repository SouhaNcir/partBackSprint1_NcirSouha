package com.souhancir_voitures.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.souhancir_voitures.entities.Marque;
import com.souhancir_voitures.entities.Voiture;


@RepositoryRestResource(path="rest")
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
	
	
	List<Voiture> findByModele(String model);
	List<Voiture> findByModeleContains(String model);
	
	/*@Query("select v from Voiture v where v.modele like %?1 and v.prixVoiture > ?2")
	List<Voiture> findByModelePrix (String modele, Double prix);*/
	
	@Query("select v from Voiture v where v.modele like %?1 and v.prixVoiture > ?2")
	List<Voiture> findByModelePrix (@Param("modele") String modele,@Param("prix") Double prix);

	@Query("select v from Voiture v where v.marque = ?1")
	List<Voiture> findByMarque (Marque marque);
	
	List<Voiture> findByMarqueIdMar(Long id);
	
	List<Voiture> findByOrderByModeleAsc();
	
	@Query("select v from Voiture v order by v.modele ASC, v.prixVoiture DESC")
	List<Voiture> trierVoitureModelePrix();
	
	


}
