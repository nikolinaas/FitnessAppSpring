package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.entities.NalogEntity;

import java.util.List;

public interface NalogService extends CrudService<Integer> {
    List<NalogEntity> findAllWithChildren();
    NalogEntity logIn(String userName, String pass);
}
