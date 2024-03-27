package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.LokacijaOdrzavanjaEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.LokacijaOdrzavanjaEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.LokacijaOdrzavanjaService;

@Service
@Transactional
public class LokacijaOdrzavanjaServiceImpl extends CrudJPAService<LokacijaOdrzavanjaEntity, Integer> implements LokacijaOdrzavanjaService {

    private final ModelMapper modelMapper;
    private final LokacijaOdrzavanjaEntityRepository repository;

    public LokacijaOdrzavanjaServiceImpl(ModelMapper modelMapper, LokacijaOdrzavanjaEntityRepository repository) {
        super(repository, modelMapper, LokacijaOdrzavanjaEntity.class);
        this.modelMapper = modelMapper;
        this.repository = repository;
    }


}
