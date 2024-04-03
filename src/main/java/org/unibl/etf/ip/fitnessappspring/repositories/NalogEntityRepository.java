package org.unibl.etf.ip.fitnessappspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.unibl.etf.ip.fitnessappspring.models.entities.NalogEntity;

import java.util.List;

public interface NalogEntityRepository extends JpaRepository<NalogEntity,Integer> {

    @Query("SELECT p FROM NalogEntity p JOIN FETCH p.korisniksByIdnalog")
    List<NalogEntity> findAllWithChildren();


}
