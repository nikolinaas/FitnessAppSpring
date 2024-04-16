package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.PorukaEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.PorukaEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.PorukaService;

@Transactional
@Service
public class PorukaServiceImpl extends CrudJPAService<PorukaEntity,Integer> implements PorukaService {

    private final PorukaEntityRepository repository;

    private final ModelMapper modelMapper;

    public PorukaServiceImpl(PorukaEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper,PorukaEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}
