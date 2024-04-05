package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.LogInRequest;
import org.unibl.etf.ip.fitnessappspring.models.Nalog;
import org.unibl.etf.ip.fitnessappspring.models.NalogRequest;
import org.unibl.etf.ip.fitnessappspring.models.entities.NalogEntity;
import org.unibl.etf.ip.fitnessappspring.services.NalogService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/nalozi")
public class NalogController extends CrudController<Integer, NalogRequest, Nalog> {

    private final NalogService nalogService;
    protected NalogController(NalogService service) {
        super(service, Nalog.class);
        this.nalogService = service;
    }

    @GetMapping("/korisnici")
    public List<NalogEntity> getALL(){
      return   nalogService.findAllWithChildren();
    }

    @PostMapping("/login")
    public NalogEntity logIn(@RequestBody LogInRequest request){
        return  nalogService.logIn(request.getKorisnickoIme(),request.getLozinka());
    }
}
