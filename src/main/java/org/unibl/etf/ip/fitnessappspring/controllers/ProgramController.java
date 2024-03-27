package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.ProgramRequest;
import org.unibl.etf.ip.fitnessappspring.models.SingleProgram;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;
import org.unibl.etf.ip.fitnessappspring.services.ProgramService;

import java.util.List;

@RestController
@RequestMapping("programs")
public class ProgramController extends CrudController<Integer, ProgramRequest, Program> {


   // private final ProgramService programService;

    public ProgramController(ProgramService programService) {
        super(programService, Program.class);

    }


   /* @GetMapping
    List<Program> findAll(){
        return programService.findAll(Program.class);
    }

    @GetMapping("/{id}")
    SingleProgram findById(@PathVariable Integer id) throws NotFoundException {
        return programService.findById(id, SingleProgram.class);
    }

    *//* dobavljanje svih programa po id-u lokacije*/
 /*   @GetMapping("/{id}/locations")
    List<Program> getAllProgramsByLocation(@PathVariable Integer id){
        return programService.getAllProgramsByLocation(id);
    }*/

    /*TODO ODRADITI OSTATAK CRUD-A ZA PROGRAME*//*

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        programService.delete(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Program insert(@RequestBody ProgramRequest request) throws NotFoundException {
        return programService.insert(request,Program.class);
    }

    @PutMapping("/{id}")
    public Program update(@PathVariable Integer id,@RequestBody ProgramRequest request) throws NotFoundException{
        return programService.update(id, request,Program.class);
    }*/
}
