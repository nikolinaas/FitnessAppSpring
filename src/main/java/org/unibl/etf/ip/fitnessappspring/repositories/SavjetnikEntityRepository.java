package org.unibl.etf.ip.fitnessappspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.ip.fitnessappspring.models.entities.SavjetnikEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.SlikaEntity;

public interface SavjetnikEntityRepository extends JpaRepository<SavjetnikEntity, Integer> {
}
