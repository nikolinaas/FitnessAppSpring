package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.exceptions.ForbiddenException;
import org.unibl.etf.ip.fitnessappspring.models.Nalog;
import org.unibl.etf.ip.fitnessappspring.models.NalogRequest;
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
    @PersistenceContext
    private EntityManager entityManager;

    public NalogServiceImpl(NalogEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper, NalogEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<NalogEntity> findAllWithChildren() {
       return repository.findAllWithChildren();

    }

    @Override
    public NalogEntity logIn(String userName, String pass) {
        List<NalogEntity> nalozi = repository.findAll();
        for(NalogEntity nalog : nalozi){
            if(nalog.getKorisnickoIme().equals(userName) && nalog.getLozinka().equals(pass)){
                return nalog;
            }
        }
        return null;
    }

    @Override
    public <T, U> T insert(U object, Class<T> resultDtoClass) {
        NalogEntity entity = modelMapper.map(object, NalogEntity.class);
        List<NalogEntity> nalozi = repository.findAll();
        for(NalogEntity nalog : nalozi){
        if(nalog.getKorisnickoIme().equals(entity.getKorisnickoIme())){

            return null;
        }
    }
        entity = repository.saveAndFlush(entity);
        entityManager.refresh(entity);
        return modelMapper.map(entity, resultDtoClass);
    }

}
