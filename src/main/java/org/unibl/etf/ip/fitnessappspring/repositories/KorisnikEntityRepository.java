package org.unibl.etf.ip.fitnessappspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;

public interface KorisnikEntityRepository extends JpaRepository<KorisnikEntity, Integer> {

    KorisnikEntity getKorisnikEntityByNalogIdnalog(Integer nalogIdnalog);
}
