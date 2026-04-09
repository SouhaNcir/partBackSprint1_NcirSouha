package com.souhancir_voitures.dto;

import java.util.Date;

import com.souhancir_voitures.entities.Marque;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VoitureDTO {
	private Long idVoiture;
	private String modele;
	private Date dateFabrication;
    private String couleur;
    private String typeCarburant;
    private String boiteVitesse;
    private double prixVoiture;
    private Marque marque;
    private String nomMar;
    

}
