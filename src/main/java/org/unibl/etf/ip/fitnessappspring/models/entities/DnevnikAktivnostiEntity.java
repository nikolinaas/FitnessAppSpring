package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "dnevnik_aktivnosti", schema = "fitnessapp", catalog = "")
public class DnevnikAktivnostiEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "iddnevnik_aktivnosti")
    private Integer iddnevnikAktivnosti;

    @Basic
    @Column(name = "vrsta_vjezbe")
    private String vrstaVjezbe;

    @Basic
    @Column(name = "trajanje")
    private Integer trajanje;

    @Basic
    @Column(name = "intezitet")
    private Integer intezitet;

    @Basic
    @Column(name = "datum_zapisa")
    private Timestamp datumZapisa;

    @Basic
    @Column(name = "br_kilograma")
    private Integer brKilograma;

    @Basic
    @Column(name = "korisnik_JMBG")
    private String korisnikJmbg;

    @ManyToOne
    @JoinColumn(name = "korisnik_JMBG", referencedColumnName = "JMBG", nullable = false,insertable=false, updatable=false)
    private KorisnikEntity korisnikByKorisnikJmbg;

}
