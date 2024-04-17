package org.unibl.etf.ip.fitnessappspring.controllers;


import org.modelmapper.ModelMapper;
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
    private final ModelMapper mapper;
    public KorisnikController(KorisnikService korisnikService, KorisnikService korisnikService1, ModelMapper mapper) {
        super(korisnikService, Korisnik.class);
        this.korisnikService = korisnikService1;
        this.mapper = mapper;
    }

 /*   @Override
    public Korisnik insert(@RequestBody KorisnikRequest req) throws NotFoundException {

        return crudService.insert(req, respClass);
    }*/

    @GetMapping("/nalog/{id}")
    Korisnik getUserByAccId(@PathVariable Integer id){
        return mapper.map(korisnikService.getUserByAccountId(id), Korisnik.class);
    }
}
