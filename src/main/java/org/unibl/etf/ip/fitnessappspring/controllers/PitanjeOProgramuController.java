package org.unibl.etf.ip.fitnessappspring.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.NacinPlacanja;
import org.unibl.etf.ip.fitnessappspring.models.NacinPlacanjaRequest;
import org.unibl.etf.ip.fitnessappspring.models.PitanjeOProgramu;
import org.unibl.etf.ip.fitnessappspring.models.PitanjeOProgramuRequest;
import org.unibl.etf.ip.fitnessappspring.models.entities.PitanjeOProgramuEntity;
import org.unibl.etf.ip.fitnessappspring.services.NacinPlacanjaService;
import org.unibl.etf.ip.fitnessappspring.services.PitanjeOProgramuService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/pitanja")
public class PitanjeOProgramuController extends CrudController<Integer, PitanjeOProgramuRequest, PitanjeOProgramu> {

    private final ModelMapper mapper;
    private final PitanjeOProgramuService service;
    protected PitanjeOProgramuController(ModelMapper mapper, PitanjeOProgramuService service) {
        super(service, PitanjeOProgramu.class);
        this.mapper = mapper;
        this.service = service;
    }

    @GetMapping("/program/{id}")
    public List<PitanjeOProgramu> GetAllByProgramId(@PathVariable  Integer id){

        return  service.getAllByProgramId(id).stream().map(l -> mapper.map(l,PitanjeOProgramu.class)).collect(Collectors.toList());
    }
}
