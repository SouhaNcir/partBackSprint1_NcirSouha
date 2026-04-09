package com.souhancir_voitures;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.souhancir_voitures.entities.Role;
import com.souhancir_voitures.entities.User;
import com.souhancir_voitures.entities.Voiture;
//import com.souhancir_voitures.service.UserService;
import com.souhancir_voitures.service.VoitureService;



@SpringBootApplication
public class VoitureNcirSouhaApplication implements CommandLineRunner{
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	@Autowired	
	VoitureService voitureService;
	
	/*@Autowired
	PasswordEncoder passwordEncoder;*/

	@Autowired
	org.springframework.data.rest.core.config.RepositoryRestConfiguration restConfig;

	public static void main(String[] args) {
		SpringApplication.run(VoitureNcirSouhaApplication.class, args);
	}
	/*
	@PostConstruct
	void init_users() {
		// ajouter les rôles
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "AGENT"));
		userService.addRole(new Role(null, "USER"));
		// ajouter les users
		userService.saveUser(new User(null, "admin", "123", true, null));
		userService.saveUser(new User(null, "souha", "123", true, null));
		userService.saveUser(new User(null, "user1", "123", true, null));
		// ajouter les rôles aux users
		userService.addRoleToUser("admin", "ADMIN");
		
		userService.addRoleToUser("souha", "USER");
		userService.addRoleToUser("souha", "AGENT");
		
		userService.addRoleToUser("user1", "USER");
	}*/


	@Override
	public void run(String... args) throws Exception {
		
		repositoryRestConfiguration.exposeIdsFor(Voiture.class);
		
		// Initialisation des données de test - mise en commentaire
		/*
		VoitureDTO v1 = new VoitureDTO();
		v1.setModele("Audi A4");
		v1.setDateFabrication(new Date(119, 2, 18));
		v1.setCouleur("Noir");
		v1.setTypeCarburant("Diesel");
		v1.setBoiteVitesse("Automatique");
		v1.setPrixVoiture(87000.0);
		voitureService.saveVoiture(v1);
		
		VoitureDTO v2 = new VoitureDTO();
		v2.setModele("Hyundai i20");
		v2.setDateFabrication(new Date(122, 10, 5));
		v2.setCouleur("Rouge");
		v2.setTypeCarburant("Essence");
		v2.setBoiteVitesse("Manuelle");
		v2.setPrixVoiture(45000.0);
		voitureService.saveVoiture(v2);
		
		VoitureDTO v3 = new VoitureDTO();
		v3.setModele("Kia Sportage");
		v3.setDateFabrication(new Date(123, 6, 12));
		v3.setCouleur("Blanc");
		v3.setTypeCarburant("Diesel");
		v3.setBoiteVitesse("Automatique");
		v3.setPrixVoiture(110000.0);
		voitureService.saveVoiture(v3);
		
		VoitureDTO v4 = new VoitureDTO();
		v4.setModele("Tesla Model 3");
		v4.setDateFabrication(new Date(124, 0, 15));
		v4.setCouleur("Bleu");
		v4.setTypeCarburant("Électrique");
		v4.setBoiteVitesse("Automatique");
		v4.setPrixVoiture(65000.0);
		voitureService.saveVoiture(v4);
		
		VoitureDTO v5 = new VoitureDTO();
		v5.setModele("BMW X5");
		v5.setDateFabrication(new Date(123, 8, 20));
		v5.setCouleur("Gris");
		v5.setTypeCarburant("Essence");
		v5.setBoiteVitesse("Automatique");
		v5.setPrixVoiture(95000.0);
		voitureService.saveVoiture(v5);
		*/
	}
	
}

