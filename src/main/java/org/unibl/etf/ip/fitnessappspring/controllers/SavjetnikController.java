package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.Poruka;
import org.unibl.etf.ip.fitnessappspring.models.Savjetnik;
import org.unibl.etf.ip.fitnessappspring.models.SavjetnikRequest;
import org.unibl.etf.ip.fitnessappspring.services.PorukaService;
import org.unibl.etf.ip.fitnessappspring.services.SavjetnikService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/savjetnici")
public class SavjetnikController extends CrudController<Integer, SavjetnikRequest, Savjetnik> {
    private final SavjetnikService service;


    public SavjetnikController(SavjetnikService service) {
        super(service, Savjetnik.class);

        this.service = service;
    }
}
