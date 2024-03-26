package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.ProgramRequest;
import org.unibl.etf.ip.fitnessappspring.models.SingleProgram;

import java.util.List;

public interface ProgramService {

    List<Program> finidAll();
    SingleProgram findById(Integer id) throws NotFoundException;

    public List<Program> getAllProgramsByLocation(Integer id);

    public void delete(Integer id);

    public Program insert(ProgramRequest request) throws NotFoundException;

    public Program update(Integer id,ProgramRequest request) throws NotFoundException;
}
