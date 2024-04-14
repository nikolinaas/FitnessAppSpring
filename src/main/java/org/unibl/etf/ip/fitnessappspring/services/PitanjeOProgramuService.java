package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.entities.PitanjeOProgramuEntity;
import org.unibl.etf.ip.fitnessappspring.services.impl.PitanjeOProgramuServiceImpl;

import java.util.List;

public interface PitanjeOProgramuService extends CrudService<Integer> {
    public List<PitanjeOProgramuEntity> getAllByProgramId(Integer programId);
}
