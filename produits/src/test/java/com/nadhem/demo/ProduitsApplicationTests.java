package com.nadhem.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.context.SpringBootTest;
import com.nadhem.demo.entities.*;
import com.nadhem.demo.repos.*;

@SpringBootTest
class ProduitsApplicationTests 
	{ 
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private CategorieRepository categorieRepository;
	@Test
	public void testCreateProduit() {
		Categorie cat =  new  Categorie();
        cat.setDescriptionCat("Phone");
        cat.setNomCat("cat");
        categorieRepository.save(cat);
        Produit prod = new Produit("Apple",3500.200,new Date(),cat); 
		produitRepository.save(prod);
	}
	@Test
	public void testFindProduit() { 
		Produit p = produitRepository.findById(2L).get(); 
		System.out.println(p);
	}
	@Test
	public void testUpdateProduit() { 
		Produit p = produitRepository.findById(2L).get(); 
		p.setPrixProduit(1000.0); produitRepository.save(p);
	}
	@Test
	public void testDeleteProduit(){ 
		produitRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousProduits() {
	List<Produit> prods = produitRepository.findAll(); 
		for (Produit p : prods) {
			System.out.println(p);
		}
	}
	@Test
	public void testFindByNomProduit(){
	List<Produit> prods = produitRepository.findByNomProduit("iphone X");
		for (Produit p : prods) {
		System.out.println(p);
		}
	}
	@Test
	public void testFindByNomProduitContains () {
	List<Produit> prods=produitRepository.findByNomProduitContains("iphone");
	for (Produit p : prods){
		System.out.println(p);
		} 
	}
	
	@Test 
	public void testfindByNomPrix()
	{
	List<Produit> prods = produitRepository.findByNomPrix("iphone X", 1000.0);
	for (Produit p : prods) {
		System.out.println(p);
		}
	}
	@Test
	public void testfindByCategorie() 
	{
		Categorie cat = new Categorie(); 
		cat.setIdCat(1L);
		List<Produit> prods = produitRepository.findByCategorie(cat);
		for (Produit p : prods) {
			System.out.println(p);
		}
	}
	
	@Test
	public void findByCategorieIdCat() {
		List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
		for (Produit p : prods) {
		System.out.println(p);
		}
	}
	
	@Test
	public void testfindByOrderByNomProduitAsc(){
		List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
		for (Produit p : prods){
		System.out.println(p);
		}
	}
	
	@Test public void testTrierProduitsNomsPrix(){
		List<Produit> prods = produitRepository.trierProduitsNomsPrix();
		for (Produit p : prods){
		System.out.println(p);
		}
	}
	
}