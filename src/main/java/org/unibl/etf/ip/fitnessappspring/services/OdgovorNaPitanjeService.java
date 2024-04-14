package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.entities.OdgovorNaPitanjeEntity;

import java.util.List;

public interface OdgovorNaPitanjeService  extends CrudService<Integer> {

    public List<OdgovorNaPitanjeEntity> getAllByProgramId(Integer id);
}
