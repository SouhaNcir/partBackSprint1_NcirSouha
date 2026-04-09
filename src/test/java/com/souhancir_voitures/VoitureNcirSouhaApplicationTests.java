package com.souhancir_voitures;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.souhancir_voitures.repos.VoitureRepository;
import com.souhancir_voitures.service.VoitureService;
import com.souhancir_voitures.entities.Marque;
import com.souhancir_voitures.entities.Voiture;

@SpringBootTest
class VoitureNcirSouhaApplicationTests {
	@Autowired
	private VoitureRepository VoitureRepository;
	private VoitureService voitureService ;

	@Test
	public void testCreateVoiture(){ 
		Voiture voi = new Voiture("Peugeot 208",new Date(),"Blanc",
			    "Diesel","Manuelle",18900.0);
		Voiture saved = VoitureRepository.save(voi);
        System.out.println("ID généré = " + saved.getIdVoiture());
	}
	@Test
	public void testFindAllVoiture(){
		Voiture v = VoitureRepository.findById(4L).get();
		System.out.println(v);
	}
	
	@Test
	public void testfindByModelePrix(){
		List<Voiture> vs = VoitureRepository.findByModelePrix("Audi A4", 18900.0); 
		  for (Voiture v : vs)
		    {
			  System.out.println(v);
		    }			
	}
	
	@Test
	public void testFindVoitureByModeleContains(){
		List<Voiture> vs = VoitureRepository.findByModeleContains("u "); 
		  for (Voiture v : vs)
		    {
			  System.out.println(v);
		    }			
	}
	@Test
	public void testFindVoitureByModele(){
		List<Voiture> vs = VoitureRepository.findByModele("Toyota Corolla"); 
		  for (Voiture v : vs)
		    {
			  System.out.println(v);
		    }			
	}
	
	@Test
	public void testfindByMarque()
	{
		Marque mar = new Marque();
		mar.setIdMar(1L);
		List<Voiture> voits= VoitureRepository.findByMarque(mar);
		for (Voiture v : voits)
	    {
		  System.out.println(v);
	    }	
	}

	@Test
	public void findByMarqueIdMar()
	{
		List<Voiture> voits= VoitureRepository.findByMarqueIdMar(2L);
		for (Voiture v : voits)
	    {
		  System.out.println(v);
	    }
	 }
	
	@Test
	public void findByOrderByModeleAsc() {
		List<Voiture> voits= VoitureRepository.findByOrderByModeleAsc();
		for (Voiture v : voits)
	    {
		  System.out.println(v);
	    }
	}
	
	@Test
	public void testTrierVoitureModelePrix() {
		List<Voiture> voits= VoitureRepository.trierVoitureModelePrix();
		for (Voiture v : voits)
	    {
		  System.out.println(v);
	    }
	}
	
	
	@Test
	public void testUpdateVoiture(){
		Voiture v = VoitureRepository.findById(3L).get();
		v.setPrixVoiture(500000.0);
		VoitureRepository.save(v);
		System.out.println(v);
	}
	
	
	@Test
	public void testDeleteVoiture() {
		VoitureRepository.deleteById(2L);
	}
	
	@Test
	public void testListerTousVoiture() {
		List<Voiture> voits = VoitureRepository.findAll();
		for(Voiture v : voits) {
			System.out.println(v);
		}
	}
	
	@Test
	public void testFindByNomVoitureContains() {
		Page<Voiture> voits =voitureService.getAllVoituresParPage(0,2);
		System.out.println(voits.getSize());
		System.out.println(voits.getTotalElements());
	    System.out.println(voits.getTotalPages());
	    // voits.getContent().forEach(v -> {System.out.println(v.toString());});
	    for (Voiture v : voits)
	    {
	    System.out.println(v);
	    }			
		
	}
	
	
		
}
