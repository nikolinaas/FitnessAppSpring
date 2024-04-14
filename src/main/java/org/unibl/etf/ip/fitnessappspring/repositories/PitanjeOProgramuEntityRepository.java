package org.unibl.etf.ip.fitnessappspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.ip.fitnessappspring.models.entities.PitanjeOProgramuEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;

import java.util.List;

public interface PitanjeOProgramuEntityRepository extends JpaRepository<PitanjeOProgramuEntity, Integer> {


    public List<PitanjeOProgramuEntity> getPitanjeOProgramuEntitiesByProgramIdProgram(Integer id);
}
