package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.DnevnikAktivnostiEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.DnevnikAktivnostiEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.DnevnikAktivnostiService;

@Service
@Transactional
public class DnevnikAktivnostiServiceImpl extends CrudJPAService<DnevnikAktivnostiEntity, Integer> implements DnevnikAktivnostiService {

    private final DnevnikAktivnostiEntityRepository repository;
    private final ModelMapper modelMapper;


    public DnevnikAktivnostiServiceImpl(DnevnikAktivnostiEntityRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper, DnevnikAktivnostiEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}

