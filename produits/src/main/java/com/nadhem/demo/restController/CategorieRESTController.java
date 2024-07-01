package com.nadhem.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadhem.demo.DTO.CategorieDTO;
import com.nadhem.demo.entities.Categorie;
import com.nadhem.demo.services.CategorieService;

@RestController
@RequestMapping("/api/categorie")
@CrossOrigin("http://localhost:4200")
public class CategorieRESTController {
    @Autowired
    CategorieService categorieService;

    @RequestMapping(method = RequestMethod.GET)
    public List<CategorieDTO> getAllCategories() {
        return categorieService.getAllCategories();
    }

}