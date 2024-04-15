package org.unibl.etf.ip.fitnessappspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.ip.fitnessappspring.models.entities.PorukaKorisnikuEntity;

import java.util.List;

public interface PorukaKorisnikuEntityRepository extends JpaRepository<PorukaKorisnikuEntity, Integer> {

    public List<PorukaKorisnikuEntity> findPorukaKorisnikuEntitiesByKorisnikPrimalacId(Integer id);
}
