package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.NacinPlacanja;
import org.unibl.etf.ip.fitnessappspring.models.NacinPlacanjaRequest;
import org.unibl.etf.ip.fitnessappspring.services.NacinPlacanjaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/payingmethods")
public class NacinPlacanjaController extends CrudController<Integer, NacinPlacanjaRequest, NacinPlacanja> {
    private final NacinPlacanjaService service;
    protected NacinPlacanjaController(NacinPlacanjaService service) {
        super(service, NacinPlacanja.class);
        this.service = service;
    }
}
