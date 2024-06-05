package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class DnevnikAktivnosti {
    private Integer id;

    private String vrstaVjezbe;

    private Integer trajanje;

    private Integer intezitet;

    private Timestamp datumZapisa;

    private Integer brKilograma;

    private Integer korisnikId;
    private String korisnikIdIme;
}
