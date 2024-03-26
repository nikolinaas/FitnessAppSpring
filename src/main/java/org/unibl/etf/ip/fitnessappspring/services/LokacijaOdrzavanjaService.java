package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.LokacijaOdrzavanja;

import java.util.List;

public interface LokacijaOdrzavanjaService {

public List<LokacijaOdrzavanja> findAll();
public LokacijaOdrzavanja findById(Integer id) throws NotFoundException;
}
