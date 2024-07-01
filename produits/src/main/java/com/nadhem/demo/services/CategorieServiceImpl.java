package com.nadhem.demo.services;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nadhem.demo.DTO.CategorieDTO;
import com.nadhem.demo.entities.Categorie;
import com.nadhem.demo.repos.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieService 
{

    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public Categorie saveCategorie(Categorie c) {
        return categorieRepository.save(c);
    }

    @Override
    public Categorie updateCategorie(Categorie c) {
        return categorieRepository.save(c);
    }

    @Override
    public void deleteCategorie(Categorie c) {
        categorieRepository.delete(c);
    }

    @Override
    public void deleteCategorieById(Long id) {
        categorieRepository.deleteById(id);
    }

    @Override
    public Categorie getCategorie(Long id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public List<CategorieDTO> getAllCategories() {
        return categorieRepository.findAll().stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    @Autowired
    ModelMapper modelMapper;
    @Override
    public CategorieDTO convertEntityToDto(Categorie categorie) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        CategorieDTO categorieDTO = modelMapper.map(categorie, CategorieDTO.class);
        return categorieDTO;
    }

    @Override
    public Categorie convertDtoToEntity(CategorieDTO categorieDto) {
        Categorie categorie = new Categorie();
        categorie = modelMapper.map(categorieDto, Categorie.class);
        return categorie;
    }
}