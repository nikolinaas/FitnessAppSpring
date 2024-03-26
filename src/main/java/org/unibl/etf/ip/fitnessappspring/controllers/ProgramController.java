package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.SingleProgram;
import org.unibl.etf.ip.fitnessappspring.services.ProgramService;

import java.util.List;

@RestController
@RequestMapping("programs")
public class ProgramController {


    private final ProgramService programService;

    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }


    @GetMapping
    List<Program> findAll(){
        return programService.finidAll();
    }

    @GetMapping("/{id}")
    SingleProgram findById(@PathVariable Integer id) throws NotFoundException {
        return programService.findById(id);
    }

    /* dobavljanje svih programa po id-u lokacije*/
    @GetMapping("/{id}/locations")
    List<Program> getAllProgramsByLocation(@PathVariable Integer id){
        return programService.getAllProgramsByLocation(id);
    }

    /* ODRADITI OSTATAK CRUD-A ZA PROGRAME*/
}
