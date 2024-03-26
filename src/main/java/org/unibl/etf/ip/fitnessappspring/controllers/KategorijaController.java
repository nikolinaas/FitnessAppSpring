package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Kategorija;
import org.unibl.etf.ip.fitnessappspring.services.KategorijaService;

import java.util.List;

@RestController
@RequestMapping("/kategorije")
public class KategorijaController {

    private final KategorijaService service;

    public KategorijaController(KategorijaService service) {
        this.service = service;
    }

    @RequestMapping
    public List<Kategorija> findAll(){
        return service.findAll();
    }

    @RequestMapping("/{id}")
    public Kategorija findById(@PathVariable Integer id) throws NotFoundException {
        return service.findById(id);
    }
}
