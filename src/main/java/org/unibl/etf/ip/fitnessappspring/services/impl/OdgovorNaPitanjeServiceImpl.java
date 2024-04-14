package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.OdgovorNaPitanjeEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.OdgovorNaPitanjeEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.OdgovorNaPitanjeService;

import java.util.List;

@Transactional
@Service
public class OdgovorNaPitanjeServiceImpl extends CrudJPAService<OdgovorNaPitanjeEntity,Integer> implements OdgovorNaPitanjeService {

    private final OdgovorNaPitanjeEntityRepository repository;
    private final ModelMapper modelMapper;
    @PersistenceContext
    private EntityManager entityManager;

    public OdgovorNaPitanjeServiceImpl(OdgovorNaPitanjeEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper, OdgovorNaPitanjeEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
    public List<OdgovorNaPitanjeEntity> getAllByProgramId(Integer id){
        return repository.getOdgovorNaPitanjeEntitiesByPitanjeOProgramuId(id);
    }
}
