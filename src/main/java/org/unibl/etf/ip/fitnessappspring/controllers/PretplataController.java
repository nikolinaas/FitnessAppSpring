package org.unibl.etf.ip.fitnessappspring.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.Kategorija;
import org.unibl.etf.ip.fitnessappspring.models.Pretplata;
import org.unibl.etf.ip.fitnessappspring.models.PretplataRequest;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.entities.KategorijaEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.PretplataEntity;
import org.unibl.etf.ip.fitnessappspring.services.PretplataService;
import org.unibl.etf.ip.fitnessappspring.services.ProgramService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/pretplate")
public class PretplataController extends CrudController<Integer, PretplataRequest, Pretplata> {

    private final PretplataService service;
    private final ModelMapper mapper;

    public PretplataController(PretplataService service, ModelMapper mapper) {
        super(service, Pretplata.class);

        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/kategorijeByUser/{id}")
    public List<Kategorija> getMyCategoriesById(@PathVariable Integer id){
         List<KategorijaEntity> res = new ArrayList<>();
            List<PretplataEntity> entities = service.getEntititesyuserId(id);
            for(PretplataEntity p : entities){
                res.add(p.getKategorijaByKategorijaIdkategorija());
            }

            return res.stream().map(l->mapper.map(l,Kategorija.class)).collect(Collectors.toList());
    }
}
