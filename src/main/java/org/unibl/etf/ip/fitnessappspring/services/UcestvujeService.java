package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.entities.UcestvujeEntity;

import java.util.List;

public interface UcestvujeService extends CrudService<Integer> {

    public List<UcestvujeEntity> getEntitiesByKorisnikId(Integer id, Boolean aktivan);
    public UcestvujeEntity getEntityByProgId(Integer id, Integer korisnik);
}
