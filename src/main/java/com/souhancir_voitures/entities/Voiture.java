package com.souhancir_voitures.entities;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;


@Entity 
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	@NotNull
	@Size (min = 4,max = 15)
    private String modele;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    private Date dateFabrication;
    private String couleur;
    private String typeCarburant;
    private String boiteVitesse;
    @Min(value = 10)
    @Max(value = 10000)
    private double prixVoiture;
    
    @ManyToOne
    private Marque marque;


	public Voiture( String modele, Date dateFabrication, String couleur, String typeCarburant,
			String boiteVitesse, double prixVoiture) {
		super();
		this.modele = modele;
		this.dateFabrication = dateFabrication;
		this.couleur = couleur;
		this.typeCarburant = typeCarburant;
		this.boiteVitesse = boiteVitesse;
		this.prixVoiture = prixVoiture;
	}
	

	public Voiture() {
		super();
	}
	
	public Marque getMarque() {
		return marque;
	}


	public void setMarque(Marque marque) {
		this.marque = marque;
	}


	public Long getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Date getDateFabrication() {
		return dateFabrication;
	}

	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	public String getBoiteVitesse() {
		return boiteVitesse;
	}

	public void setBoiteVitesse(String boiteVitesse) {
		this.boiteVitesse = boiteVitesse;
	}

	public double getPrixVoiture() {
		return prixVoiture;
	}

	public void setPrixVoiture(double prixVoiture) {
		this.prixVoiture = prixVoiture;
	}


	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", modele=" + modele + ", dateFabrication=" + dateFabrication
				+ ", couleur=" + couleur + ", typeCarburant=" + typeCarburant + ", boiteVitesse=" + boiteVitesse
				+ ", prixVoiture=" + prixVoiture + ", marque=" + marque + "]";
	}

	
}
