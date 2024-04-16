package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.entities.PretplataEntity;

import java.util.List;

public interface PretplataService extends CrudService<Integer> {
    List<PretplataEntity> getEntititesyuserId(Integer id);
}
