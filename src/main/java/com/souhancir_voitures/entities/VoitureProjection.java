package com.souhancir_voitures.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ModVoit", types = { Voiture.class })
public interface VoitureProjection {
	public String getModele();

}
