package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.Nalog;
import org.unibl.etf.ip.fitnessappspring.models.NalogRequest;
import org.unibl.etf.ip.fitnessappspring.models.entities.NalogEntity;
import org.unibl.etf.ip.fitnessappspring.services.NalogService;

import java.util.List;

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

}
