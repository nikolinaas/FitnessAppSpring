package org.unibl.etf.ip.fitnessappspring.controllers;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Korisnik;
import org.unibl.etf.ip.fitnessappspring.models.KorisnikRequest;
import org.unibl.etf.ip.fitnessappspring.services.KorisnikService;
import org.unibl.etf.ip.fitnessappspring.services.NalogService;

@RestController
@RequestMapping("/korisnici")
public class KorisnikController extends CrudController<Integer, KorisnikRequest, Korisnik> {

    public KorisnikController(KorisnikService korisnikService) {
        super(korisnikService, Korisnik.class);
    }

 /*   @Override
    public Korisnik insert(@RequestBody KorisnikRequest req) throws NotFoundException {

        return crudService.insert(req, respClass);
    }*/
}
