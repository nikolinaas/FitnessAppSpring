package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.PitanjeOProgramuEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.PitanjeOProgramuEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.PitanjeOProgramuService;

import java.util.List;

@Service
@Transactional
public class PitanjeOProgramuServiceImpl extends CrudJPAService<PitanjeOProgramuEntity,Integer> implements PitanjeOProgramuService {
    private final PitanjeOProgramuEntityRepository repository;
    private final ModelMapper modelMapper;
    @PersistenceContext
    private EntityManager entityManager;

    public PitanjeOProgramuServiceImpl(PitanjeOProgramuEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper, PitanjeOProgramuEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PitanjeOProgramuEntity> getAllByProgramId(Integer programId) {
        return repository.getPitanjeOProgramuEntitiesByProgramIdProgram(programId);
    }
}
