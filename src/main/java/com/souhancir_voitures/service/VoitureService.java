package com.souhancir_voitures.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.souhancir_voitures.dto.VoitureDTO;
import com.souhancir_voitures.entities.Marque;
import com.souhancir_voitures.entities.Voiture;

public interface VoitureService {
	
	Voiture saveVoiture(Voiture v);
	Voiture updateVoiture(Voiture v);
	
	Voiture getVoiture(Long id);
	List<Voiture> getAllVoitures();
	
	void deleteVoiture(Voiture v);
	void deleteVoitureById(Long id);
	
	Page<Voiture> getAllVoituresParPage(int page,int size);
	List<Voiture> findByModele(String model);
	List<Voiture> findByModeleContains(String model);
	List<Voiture> findByModelePrix (String modele, Double prix);
	List<Voiture> findByMarque (Marque marque);
	List<Voiture> findByMarqueIdMar(Long id);
	List<Voiture> findByOrderByModeleAsc();
	List<Voiture> trierVoitureModelePrix();
	List<Marque> getAllMarques();

    VoitureDTO convertEntityToDto(Voiture v);
    Voiture convertDtoToEntity(VoitureDTO voitureDTO);
    


}
