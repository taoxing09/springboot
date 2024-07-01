package com.nadhem.demo.services;

import java.util.List;

import com.nadhem.demo.entities.Categorie;
import com.nadhem.demo.entities.Produit;
import com.nadhem.demo.DTO.*;

public interface ProduitService { 
	ProduitDTO saveProduit(ProduitDTO p); 
	ProduitDTO updateProduit(ProduitDTO p); 
	void deleteProduit(Produit p); 
	void deleteProduitById(Long id); 
	ProduitDTO getProduit(Long id); 
	List<ProduitDTO> getAllProduits();
	List<ProduitDTO> findByNomProduit(String nom); 
	List<ProduitDTO> findByNomProduitContains(String nom); 
	List<ProduitDTO> findByNomPrix (String nom, Double prix); 
	List<ProduitDTO> findByCategorie (Categorie categorie); 
	List<ProduitDTO> findByCategorieIdCat(Long id); 
	List<ProduitDTO> findByOrderByNomProduitAsc(); 
	List<ProduitDTO> trierProduitsNomsPrix();
	
	ProduitDTO convertEntityToDto (Produit produit);
	Produit convertDtoToEntity(ProduitDTO produitDto);
}

