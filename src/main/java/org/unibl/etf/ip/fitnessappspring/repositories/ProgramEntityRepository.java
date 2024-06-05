package org.unibl.etf.ip.fitnessappspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.entities.PitanjeOProgramuEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;

import java.util.List;

public interface ProgramEntityRepository extends JpaRepository<ProgramEntity, Integer> {

    public List<ProgramEntity> getAllByLokacijaOdrzavanjaIdlokacijaOdrzavanja(Integer id);
    public List<ProgramEntity> getAllByKategorijaIdkategorija(Integer id);
    public ProgramEntity getById(Integer id);


}
