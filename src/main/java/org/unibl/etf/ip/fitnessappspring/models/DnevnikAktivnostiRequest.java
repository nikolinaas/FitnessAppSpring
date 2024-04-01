package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class DnevnikAktivnostiRequest {
    private String vrstaVjezbe;

    private Integer trajanje;

    private Integer intezitet;

    private Timestamp datumZapisa;

    private Integer brKilograma;

    private String korisnikJmbg;
}
