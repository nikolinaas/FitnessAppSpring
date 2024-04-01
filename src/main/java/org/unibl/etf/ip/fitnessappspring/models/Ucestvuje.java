package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Ucestvuje {
    private String korisnikJmbg;

    private Integer programIdProgram;

    private Integer nacinPlacanjaIdnacinPlacanja;

    private String nacinPlacanjaByIdNacinplacanjaNaziv;

    private Boolean instruktor;
}
