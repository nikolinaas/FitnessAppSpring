package org.unibl.etf.ip.fitnessappspring.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.Ucestvuje;
import org.unibl.etf.ip.fitnessappspring.models.UcestvujeRequest;
import org.unibl.etf.ip.fitnessappspring.services.UcestvujeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/participations")
public class UcestvujeController extends CrudController<Integer, UcestvujeRequest, Ucestvuje> {

    private final UcestvujeService service;

    public UcestvujeController(UcestvujeService service) {
        super(service, Ucestvuje.class);
        this.service = service;
    }
}
