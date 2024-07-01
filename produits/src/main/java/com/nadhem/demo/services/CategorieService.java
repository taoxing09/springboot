package com.nadhem.demo.services;

import java.util.List;

import com.nadhem.demo.DTO.CategorieDTO;
import com.nadhem.demo.entities.Categorie;

public interface CategorieService {

    Categorie saveCategorie(Categorie p);
    Categorie updateCategorie(Categorie p);
    void deleteCategorie(Categorie  p);
    void deleteCategorieById(Long id);
    Categorie getCategorie(Long id);
    List<CategorieDTO> getAllCategories();


    CategorieDTO convertEntityToDto (Categorie categorie);

    Categorie convertDtoToEntity(CategorieDTO categorie);
}