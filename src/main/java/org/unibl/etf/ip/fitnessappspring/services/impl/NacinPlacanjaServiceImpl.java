package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.NacinPlacanjaEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.NacinPlacanjaEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.NacinPlacanjaService;

@Service
@Transactional
public class NacinPlacanjaServiceImpl extends CrudJPAService<NacinPlacanjaEntity, Integer> implements NacinPlacanjaService {
    private final NacinPlacanjaEntityRepository repository;
    private final ModelMapper modelMapper;
    @PersistenceContext
    private EntityManager entityManager;

    public NacinPlacanjaServiceImpl(NacinPlacanjaEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper, NacinPlacanjaEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}
