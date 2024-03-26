package org.unibl.etf.ip.fitnessappspring.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.LokacijaOdrzavanja;
import org.unibl.etf.ip.fitnessappspring.repositories.LokacijaOdrzavanjaEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.LokacijaOdrzavanjaService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LokacijaOdrzavanjaServiceImpl implements LokacijaOdrzavanjaService {

    private final ModelMapper modelMapper;
    private final LokacijaOdrzavanjaEntityRepository repository;

    public LokacijaOdrzavanjaServiceImpl(ModelMapper modelMapper, LokacijaOdrzavanjaEntityRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    @Override
    public List<LokacijaOdrzavanja> findAll() {
        return  repository.findAll().stream().map(l -> modelMapper.map(l,LokacijaOdrzavanja.class)).collect(Collectors.toList());
    }

    @Override
    public LokacijaOdrzavanja findById(Integer id) throws  NotFoundException {
        return modelMapper.map(repository.findById(id).orElseThrow(NotFoundException::new),LokacijaOdrzavanja.class);
    }
}
