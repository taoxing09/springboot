package com.nadhem.demo.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*;
import com.nadhem.demo.DTO.ProduitDTO;
import com.nadhem.demo.entities.Produit; 
import com.nadhem.demo.services.ProduitService;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin("http://localhost:4200")

public class ProduitRESTController {
	@Autowired
	ProduitService produitService;
	
	@GetMapping("/all")
	public List<ProduitDTO> getAllProduits() {
		return produitService.getAllProduits();
	}
	
	@GetMapping("/{id}") 
	public ProduitDTO getProduitById(@PathVariable("id") Long id) { 
		return produitService.getProduit(id);
	}
	
	
	@PostMapping("/save")
	public void saveProduit(@RequestBody ProduitDTO produit)
	{
		produitService.saveProduit(produit) ;
	}
	
	@PutMapping
	public ProduitDTO updateProduit(@RequestBody ProduitDTO produit) { 
		return produitService.updateProduit(produit);
	}
	

	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable("id") Long id)
	{
		produitService.deleteProduitById(id);
	}
	
	@GetMapping("/prodscat/{idCat}")
	public List<ProduitDTO> getProduitsByCatId(@PathVariable("idCat") Long idCat) { 
		return produitService.findByCategorieIdCat(idCat);
	}
}