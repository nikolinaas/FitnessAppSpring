package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.UcestvujeEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.UcestvujeEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.UcestvujeService;

@Service
@Transactional
public class UcestvujeServiceImpl extends CrudJPAService<UcestvujeEntity,Integer> implements UcestvujeService {

    private final ModelMapper modelMapper;
    private final UcestvujeEntityRepository repository;

    public UcestvujeServiceImpl(ModelMapper modelMapper, UcestvujeEntityRepository repository) {
        super(repository, modelMapper, UcestvujeEntity.class);
        this.modelMapper = modelMapper;
        this.repository = repository;
    }
}
