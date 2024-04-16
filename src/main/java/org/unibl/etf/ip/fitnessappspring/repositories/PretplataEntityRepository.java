package org.unibl.etf.ip.fitnessappspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.ip.fitnessappspring.models.entities.PretplataEntity;

import java.util.List;

public interface PretplataEntityRepository  extends JpaRepository<PretplataEntity, Integer> {

    public List<PretplataEntity> findAllByKorisnikId(Integer id);
}
