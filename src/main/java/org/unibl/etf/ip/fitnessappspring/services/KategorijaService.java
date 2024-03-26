package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Kategorija;

import java.util.List;

public interface KategorijaService {

    public List<Kategorija> findAll();
    public Kategorija findById(Integer id) throws NotFoundException;
}
