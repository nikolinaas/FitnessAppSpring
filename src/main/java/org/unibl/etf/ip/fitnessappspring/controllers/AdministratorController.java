package org.unibl.etf.ip.fitnessappspring.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.models.entities.AdministratorEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.AdministratorEntityRepository;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdministratorController {


    private final AdministratorEntityRepository repository;

    public AdministratorController(AdministratorEntityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<AdministratorEntity> findAll(){
            return repository.findAll();
    }
}
