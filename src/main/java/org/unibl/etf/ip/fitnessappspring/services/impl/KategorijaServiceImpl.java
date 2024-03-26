package org.unibl.etf.ip.fitnessappspring.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Kategorija;
import org.unibl.etf.ip.fitnessappspring.repositories.KategorijaEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.KategorijaService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KategorijaServiceImpl implements KategorijaService {

    private final ModelMapper modelMapper;
    private final KategorijaEntityRepository repository;

    public KategorijaServiceImpl(ModelMapper modelMapper, KategorijaEntityRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    @Override
    public List<Kategorija> findAll() {
       return repository.findAll().stream().map(l -> modelMapper.map(l,Kategorija.class)).collect(Collectors.toList());
    }

    @Override
    public Kategorija findById(Integer id) throws NotFoundException {
        return modelMapper.map(repository.findById(id).orElseThrow(NotFoundException::new), Kategorija.class);
    }
}
