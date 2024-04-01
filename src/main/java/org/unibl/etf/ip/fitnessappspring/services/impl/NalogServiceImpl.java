package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.NalogEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.NalogEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.NalogService;

import java.util.List;

@Service
@Transactional
public class NalogServiceImpl extends CrudJPAService<NalogEntity, Integer> implements NalogService {


    private final NalogEntityRepository repository;
    private final ModelMapper modelMapper;

    public NalogServiceImpl(NalogEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper, NalogEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<NalogEntity> findAllWithChildren() {
       return repository.findAllWithChildren();

    }
}
