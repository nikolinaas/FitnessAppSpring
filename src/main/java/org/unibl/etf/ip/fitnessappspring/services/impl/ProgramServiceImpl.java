package org.unibl.etf.ip.fitnessappspring.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.SingleProgram;
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
}
