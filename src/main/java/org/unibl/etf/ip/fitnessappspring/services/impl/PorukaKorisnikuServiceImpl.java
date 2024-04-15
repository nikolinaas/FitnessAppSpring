package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.PorukaKorisniku;
import org.unibl.etf.ip.fitnessappspring.models.entities.PorukaKorisnikuEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.PorukaKorisnikuEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.PorukaKorisnikuService;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class PorukaKorisnikuServiceImpl extends CrudJPAService<PorukaKorisnikuEntity,Integer> implements PorukaKorisnikuService {

    private final PorukaKorisnikuEntityRepository repository;

    private final ModelMapper modelMapper;

    public PorukaKorisnikuServiceImpl(PorukaKorisnikuEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper, PorukaKorisnikuEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PorukaKorisniku> getPorukeByPrimalac(Integer id) {
     List<PorukaKorisniku> res =  repository.findPorukaKorisnikuEntitiesByKorisnikPrimalacId(id).stream().map(l -> modelMapper.map(l, PorukaKorisniku.class)).collect(Collectors.toList());
        return res;
    }
}
