package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.PretplataEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.SavjetnikEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.SavjetnikEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.SavjetnikService;

import java.util.List;

@Transactional
@Service
public class SavjetnikServiceImpl extends CrudJPAService<SavjetnikEntity,Integer> implements SavjetnikService {

    private final SavjetnikEntityRepository repository;

    private final ModelMapper modelMapper;

    public SavjetnikServiceImpl(SavjetnikEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper,SavjetnikEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }


}
