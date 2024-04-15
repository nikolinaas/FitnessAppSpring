package org.unibl.etf.ip.fitnessappspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.OdgovorNaPitanjeEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;

import java.util.List;

@Data
public class PitanjeOProgramu {

    private Integer id;

    private String tekstPitanja;

    private Integer korisnikId;

    private Integer programIdProgram;

    private String korisnikIme;
    private String korisnikPrezime;

    private List<OdgovorNaPitanje> odgovori;
   // private ProgramEntity programByProgramIdProgram;

}
