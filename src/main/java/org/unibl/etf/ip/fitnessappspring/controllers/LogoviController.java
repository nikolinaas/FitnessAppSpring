package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.Logovi;
import org.unibl.etf.ip.fitnessappspring.models.LogoviRequest;
import org.unibl.etf.ip.fitnessappspring.services.LogoviService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/logovi")
public class LogoviController extends CrudController<Integer, LogoviRequest, Logovi> {

    public LogoviController(LogoviService service) {
        super(service, Logovi.class);
    }


}
