package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.LokacijaOdrzavanja;
import org.unibl.etf.ip.fitnessappspring.models.LokacijaOdrzavnjaRequest;
import org.unibl.etf.ip.fitnessappspring.services.LokacijaOdrzavanjaService;

import java.util.List;

@RestController
@RequestMapping("/lokacije")
public class LokacijaOdrzavanjaController extends CrudController<Integer, LokacijaOdrzavnjaRequest, LokacijaOdrzavanja> {

    public LokacijaOdrzavanjaController(LokacijaOdrzavanjaService service) {
        super(service,LokacijaOdrzavanja.class);
    }
   /* private final LokacijaOdrzavanjaService service;

    public LokacijaOdrzavanjaController(LokacijaOdrzavanjaService service) {
        this.service = service;
    }

    @GetMapping
    public List<LokacijaOdrzavanja> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public  LokacijaOdrzavanja findById(@PathVariable int id) throws NotFoundException {
        return service.findById(id);
    }*/
}
