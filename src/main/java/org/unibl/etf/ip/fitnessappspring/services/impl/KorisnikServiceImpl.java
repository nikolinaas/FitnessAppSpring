package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.KorisnikEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.KorisnikService;

@Service
@Transactional
public class KorisnikServiceImpl extends CrudJPAService<KorisnikEntity, String> implements KorisnikService {
   private final KorisnikEntityRepository repository;
   private final ModelMapper modelMapper;
    public KorisnikServiceImpl(KorisnikEntityRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper, KorisnikEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}
