package org.unibl.etf.ip.fitnessappspring.controllers;


import org.springframework.web.bind.annotation.*;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Korisnik;
import org.unibl.etf.ip.fitnessappspring.models.KorisnikRequest;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;
import org.unibl.etf.ip.fitnessappspring.services.KorisnikService;
import org.unibl.etf.ip.fitnessappspring.services.NalogService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/korisnici")
public class KorisnikController extends CrudController<Integer, KorisnikRequest, Korisnik> {

    private final KorisnikService korisnikService;
    public KorisnikController(KorisnikService korisnikService, KorisnikService korisnikService1) {
        super(korisnikService, Korisnik.class);
        this.korisnikService = korisnikService1;
    }

 /*   @Override
    public Korisnik insert(@RequestBody KorisnikRequest req) throws NotFoundException {

        return crudService.insert(req, respClass);
    }*/

    @GetMapping("/nalog/{id}")
    KorisnikEntity getUserByAccId(@PathVariable Integer id){
        return korisnikService.getUserByAccountId(id);
    }
}
