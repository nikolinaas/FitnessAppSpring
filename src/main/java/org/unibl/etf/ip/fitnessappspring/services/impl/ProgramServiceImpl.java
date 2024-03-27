package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
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
@Transactional
public class ProgramServiceImpl extends CrudJPAService<ProgramEntity,Integer> implements ProgramService {

    private final ProgramEntityRepository repository;

    private final ModelMapper modelMapper;

    public ProgramServiceImpl(ProgramEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper,ProgramEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }



    @Override
    public List<Program> getAllProgramsByLocation(Integer id) {
    return repository.getAllByLokacijaOdrzavanjaIdlokacijaOdrzavanja(id).stream().map(l -> modelMapper.map(l, Program.class)).collect(Collectors.toList());
    }





}
