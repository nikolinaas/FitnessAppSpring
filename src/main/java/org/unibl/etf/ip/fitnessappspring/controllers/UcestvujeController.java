package org.unibl.etf.ip.fitnessappspring.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.models.Korisnik;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.Ucestvuje;
import org.unibl.etf.ip.fitnessappspring.models.UcestvujeRequest;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.UcestvujeEntity;
import org.unibl.etf.ip.fitnessappspring.services.UcestvujeService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/participations")
public class UcestvujeController extends CrudController<Integer, UcestvujeRequest, Ucestvuje> {

    private final UcestvujeService service;
    private final ModelMapper mapper;

    public UcestvujeController(UcestvujeService service, ModelMapper mapper) {
        super(service, Ucestvuje.class);
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/programiAktivni/{id}")
    public List<Program> getProgramsByKorisnikId(@PathVariable  Integer id){
        List<ProgramEntity> progs = new ArrayList<>();
        List<UcestvujeEntity> entities = service.getEntitiesByKorisnikId(id,true);
        for(UcestvujeEntity ent : entities){
            progs.add(ent.getProgramByProgramIdProgram());
        }
        return progs.stream().map(l -> mapper.map(l,Program.class)).collect(Collectors.toList());
    }
    @GetMapping("/programiNeaktivni/{id}")
    public List<Program> getProgramsUnactiveByKorisnikId(@PathVariable  Integer id){
        List<ProgramEntity> progs = new ArrayList<>();
        List<UcestvujeEntity> entities = service.getEntitiesByKorisnikId(id,false);
        for(UcestvujeEntity ent : entities){
            progs.add(ent.getProgramByProgramIdProgram());
        }
        return progs.stream().map(l -> mapper.map(l,Program.class)).collect(Collectors.toList());
    }
    @GetMapping("/program/{id}/{korisnik}")
    public UcestvujeEntity getUcestvujeByProgId(@PathVariable  Integer id, @PathVariable Integer korisnik){
        return service.getEntityByProgId(id,korisnik);
    }

    @GetMapping("/instruktor/program/{id}")
    List<Korisnik> getInstruktoriByProgId(@PathVariable Integer id){
        List<KorisnikEntity> korisnici = new ArrayList<>();
        List<UcestvujeEntity> entities = service.getEntitiesWithInstruktor(true,id);
        for(UcestvujeEntity ent : entities){
            korisnici.add(ent.getKorisnikByKorisnikId());
        }

        return korisnici.stream().map(l -> mapper.map(l, Korisnik.class)).collect(Collectors.toList());
    }
}
