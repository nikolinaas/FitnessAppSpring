package org.unibl.etf.ip.fitnessappspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.ip.fitnessappspring.models.entities.OdgovorNaPitanjeEntity;

import java.util.List;

public interface OdgovorNaPitanjeEntityRepository extends JpaRepository<OdgovorNaPitanjeEntity, Integer> {

    public List<OdgovorNaPitanjeEntity> getOdgovorNaPitanjeEntitiesByPitanjeOProgramuId(Integer id);
}
