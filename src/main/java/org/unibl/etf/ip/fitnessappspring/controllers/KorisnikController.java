package org.unibl.etf.ip.fitnessappspring.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.Korisnik;
import org.unibl.etf.ip.fitnessappspring.models.KorisnikRequest;
import org.unibl.etf.ip.fitnessappspring.services.KorisnikService;

@RestController
@RequestMapping("/korisnici")
public class KorisnikController extends CrudController<String, KorisnikRequest, Korisnik> {

    public KorisnikController(KorisnikService korisnikService) {
        super(korisnikService, Korisnik.class);
    }

}
