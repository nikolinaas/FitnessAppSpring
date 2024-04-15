package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.entities.UcestvujeEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.UcestvujeEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.UcestvujeService;

import java.util.List;

@Service
@Transactional
public class UcestvujeServiceImpl extends CrudJPAService<UcestvujeEntity,Integer> implements UcestvujeService {

    private final ModelMapper modelMapper;
    private final UcestvujeEntityRepository repository;

    public UcestvujeServiceImpl(ModelMapper modelMapper, UcestvujeEntityRepository repository) {
        super(repository, modelMapper, UcestvujeEntity.class);
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    @Override
    public List<UcestvujeEntity> getEntitiesByKorisnikId(Integer id, Boolean aktivan) {
        return repository.findUcestvujeEntitiesByKorisnikIdAndAktivno(id,aktivan);
    }

    @Override
    public UcestvujeEntity getEntityByProgId(Integer id, Integer korisnik) {
        return repository.findByProgramIdProgramAndKorisnikId(id, korisnik);
    }
}
