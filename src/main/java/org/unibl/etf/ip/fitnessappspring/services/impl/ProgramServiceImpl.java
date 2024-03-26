package org.unibl.etf.ip.fitnessappspring.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.ProgramRequest;
import org.unibl.etf.ip.fitnessappspring.models.SingleProgram;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.ProgramEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.ProgramService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProgramServiceImpl implements ProgramService {

    private final ProgramEntityRepository repository;

    private final ModelMapper modelMapper;

    public ProgramServiceImpl(ProgramEntityRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Program> finidAll() {

        return repository.findAll().stream().map(l -> modelMapper.map(l, Program.class)).collect(Collectors.toList());
    }

    @Override
    public SingleProgram findById(Integer id)throws NotFoundException {
        return modelMapper.map(repository.findById(id).orElseThrow(NotFoundException::new),SingleProgram.class);
    }

    @Override
    public List<Program> getAllProgramsByLocation(Integer id) {
    return repository.getAllByLokacijaOdrzavanjaIdlokacijaOdrzavanja(id).stream().map(l -> modelMapper.map(l, Program.class)).collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Program insert(ProgramRequest request) throws NotFoundException {
        ProgramEntity programEntity = modelMapper.map(request, ProgramEntity.class);
        programEntity.setIdProgram(null);
        programEntity = repository.saveAndFlush(programEntity);
        return findById(programEntity.getIdProgram());

    }

    @Override
    public Program update(Integer id,ProgramRequest request) throws NotFoundException {
        ProgramEntity programEntity = modelMapper.map(request, ProgramEntity.class);
        programEntity.setIdProgram(id);
        programEntity = repository.saveAndFlush(programEntity);

        return findById(programEntity.getIdProgram());
    }


}
