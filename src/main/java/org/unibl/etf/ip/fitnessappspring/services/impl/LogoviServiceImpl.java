package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.LogoviEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.LogoviEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.LogoviService;

@Transactional
@Service
public class LogoviServiceImpl extends CrudJPAService<LogoviEntity, Integer> implements LogoviService {
    private final ModelMapper modelMapper;
    private final LogoviEntityRepository repository;

    public LogoviServiceImpl(ModelMapper modelMapper, LogoviEntityRepository repository) {
        super(repository, modelMapper, LogoviEntity.class);
        this.modelMapper = modelMapper;
        this.repository = repository;
    }
}
