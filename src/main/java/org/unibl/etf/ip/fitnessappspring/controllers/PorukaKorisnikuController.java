package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.web.bind.annotation.*;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.PorukaKorisniku;
import org.unibl.etf.ip.fitnessappspring.models.PorukaKorisnikuRequest;
import org.unibl.etf.ip.fitnessappspring.models.entities.PorukaKorisnikuEntity;
import org.unibl.etf.ip.fitnessappspring.services.PorukaKorisnikuService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/porukeByKorisnik")
public class PorukaKorisnikuController extends CrudController<Integer, PorukaKorisnikuRequest, PorukaKorisniku> {
    private final PorukaKorisnikuService service;


    public PorukaKorisnikuController(PorukaKorisnikuService service) {
        super(service, PorukaKorisniku.class);

        this.service = service;
    }

    @GetMapping("/primalac/{id}")
    public List<PorukaKorisniku> getPorukeByKorisnikPrimalac(@PathVariable Integer id){
        return service.getPorukeByPrimalac(id);
    }
}
