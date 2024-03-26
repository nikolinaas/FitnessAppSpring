package org.unibl.etf.ip.fitnessappspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;

public interface ProgramEntityRepository extends JpaRepository<ProgramEntity, Integer> {
}
