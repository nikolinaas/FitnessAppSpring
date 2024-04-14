package org.unibl.etf.ip.fitnessappspring.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.OdgovorNaPitanje;
import org.unibl.etf.ip.fitnessappspring.models.OdgovorNaPitanjeRequest;
import org.unibl.etf.ip.fitnessappspring.services.OdgovorNaPitanjeService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/odgovori")
public class OdgovorNaPitanjeController extends CrudController<Integer, OdgovorNaPitanjeRequest, OdgovorNaPitanje> {
    private final ModelMapper mapper;
    private final OdgovorNaPitanjeService service;
    protected OdgovorNaPitanjeController(ModelMapper mapper, OdgovorNaPitanjeService service) {
        super(service, OdgovorNaPitanje.class);
        this.mapper = mapper;
        this.service = service;
    }

    @GetMapping ("/pitanje/{id}")
    public List<OdgovorNaPitanje> getAllByProgramId(@PathVariable Integer id){
        return service.getAllByProgramId(id).stream().map(l -> mapper.map(l, OdgovorNaPitanje.class)).collect(Collectors.toList());
    }
}
