package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.Korisnik;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.KorisnikEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.KorisnikService;

@Service
@Transactional
public class KorisnikServiceImpl extends CrudJPAService<KorisnikEntity, Integer> implements KorisnikService {
   private final KorisnikEntityRepository repository;
   private final ModelMapper modelMapper;
    @PersistenceContext
    private EntityManager entityManager;
    public KorisnikServiceImpl(KorisnikEntityRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper, KorisnikEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public KorisnikEntity insert(Korisnik k, KorisnikEntity entclass) {

        KorisnikEntity entity = modelMapper.map(k, KorisnikEntity.class);
        entity = repository.saveAndFlush(entity);

        entityManager.refresh(entity);
        System.out.println(entity);
        return modelMapper.map(entity, KorisnikEntity.class);
    }
}
