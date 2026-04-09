package com.souhancir_voitures.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.souhancir_voitures.dto.VoitureDTO;
import com.souhancir_voitures.entities.Voiture;
import com.souhancir_voitures.service.VoitureService;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api") // L'URL de base est juste "/api"
@CrossOrigin
@AllArgsConstructor
public class VoitureRestController {
	//@Autowired
	private final VoitureService voitureService;
	
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping()
	public List<Voiture> getAllVoitures() {
		return voitureService.getAllVoitures();
	} 	
	
	//@RequestMapping(value="/{id}", method = RequestMethod.GET)
	@GetMapping("/{id}")
	public Voiture getVoitureById(@PathVariable("id") Long id) {	
		return voitureService.getVoiture(id);
    }
	
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping()
	public Voiture createVoiture(@RequestBody Voiture voiture) {
		return voitureService.saveVoiture(voiture);
	}
	
	//@RequestMapping(method = RequestMethod.PUT)
	@PutMapping()
	public Voiture updateVoiture(@RequestBody Voiture voiture) {
		return voitureService.updateVoiture(voiture);
	}
	
	//@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/{id}")
	public void deleteVoiture(@PathVariable("id") Long id) {
		voitureService.deleteVoitureById(id);
	}
	
	
	// @RequestMapping(value="/voitMat/{idMar}", method = RequestMethod.GET)
	@GetMapping("/voitMat/{idMar}")
	public List<Voiture> getVoituresByMarId(@PathVariable("idMar") Long idMar) {
		return voitureService.findByMarqueIdMar(idMar);
	}
	
	

}
