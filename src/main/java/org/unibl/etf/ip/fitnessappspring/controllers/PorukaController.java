package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.Poruka;
import org.unibl.etf.ip.fitnessappspring.models.PorukaKorisniku;
import org.unibl.etf.ip.fitnessappspring.models.PorukaRequest;
import org.unibl.etf.ip.fitnessappspring.services.PorukaKorisnikuService;
import org.unibl.etf.ip.fitnessappspring.services.PorukaService;


@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/porukeSavjetniku")
public class PorukaController  extends CrudController<Integer, PorukaRequest, Poruka> {
    private final PorukaService service;


    public PorukaController(PorukaService service) {
        super(service, Poruka.class);

        this.service = service;
    }
}
