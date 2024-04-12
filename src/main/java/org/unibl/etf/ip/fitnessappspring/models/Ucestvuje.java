package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;

@Data
public class Ucestvuje {
    private String korisnikId;


    private Integer programIdProgram;

    private Integer nacinPlacanjaIdnacinPlacanja;

    private String nacinPlacanjaByIdNacinplacanjaNaziv;

    private Boolean instruktor;

    private String korisnikIme;
  //  private ProgramEntity program;
}
