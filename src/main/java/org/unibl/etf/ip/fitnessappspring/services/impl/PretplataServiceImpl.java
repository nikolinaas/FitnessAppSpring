package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.PretplataEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.PretplataEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.PretplataService;

import java.util.List;

@Transactional
@Service
public class PretplataServiceImpl extends CrudJPAService<PretplataEntity,Integer> implements PretplataService {

    private final PretplataEntityRepository repository;

    private final ModelMapper modelMapper;

    public PretplataServiceImpl(PretplataEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper,PretplataEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PretplataEntity> getEntititesyuserId(Integer id){
        return repository.findAllByKorisnikId(id);
    }
}
