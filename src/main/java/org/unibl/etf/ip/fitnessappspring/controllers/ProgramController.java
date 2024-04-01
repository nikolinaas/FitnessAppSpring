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
@RequestMapping("/programs")
public class ProgramController extends CrudController<Integer, ProgramRequest, Program> {


   // private final ProgramService programService;

    public ProgramController(ProgramService programService) {
        super(programService, Program.class);

    }


}
