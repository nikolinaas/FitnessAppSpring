package org.unibl.etf.ip.fitnessappspring.repositories;

import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.entities.UcestvujeEntity;

import java.util.List;

public interface UcestvujeEntityRepository extends JpaRepository<UcestvujeEntity, Integer> {


    public List<UcestvujeEntity>  findUcestvujeEntitiesByKorisnikIdAndAktivno(Integer id, Boolean aktivan);
    public List<UcestvujeEntity>  findUcestvujeEntitiesByInstruktorAndProgramIdProgram(Boolean isInstruktor, Integer id);
    public  UcestvujeEntity getByProgramIdProgram(Integer id);
    public  UcestvujeEntity findByProgramIdProgramAndKorisnikId(Integer id, Integer korisnik);

}
