package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.PorukaKorisniku;
import org.unibl.etf.ip.fitnessappspring.models.entities.PorukaKorisnikuEntity;

import java.util.List;

public interface PorukaKorisnikuService extends CrudService<Integer> {
    public List<PorukaKorisniku> getPorukeByPrimalac(Integer id);
}
