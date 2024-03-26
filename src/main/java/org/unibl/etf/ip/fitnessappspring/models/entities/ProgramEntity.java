package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@Table(name = "program", schema = "fitnessapp", catalog = "")
public class ProgramEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_program")
    private Integer idProgram;

    @Basic
    @Column(name = "opis")
    private String opis;

    @Basic
    @Column(name = "cijena")
    private Integer cijena;

    @Basic
    @Column(name = "nivo_tezine")
    private Integer nivoTezine;

    @Basic
    @Column(name = "trajanje")
    private Integer trajanje;

    @Basic
    @Column(name = "slike")
    private String slike;

    @Basic
    @Column(name = "lokacija_odrzavanja_idlokacija_odrzavanja")
    private Integer lokacijaOdrzavanjaIdlokacijaOdrzavanja;

    @Basic
    @Column(name = "kategorija_idkategorija")
    private Integer kategorijaIdkategorija;

    @Basic
    @Column(name = "online")
    private Boolean online;

    @Basic
    @Column(name = "uzivo")
    private Boolean uzivo;

    @Basic
    @Column(name = "naziv_programa")
    private String nazivPrograma;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lokacija_odrzavanja_idlokacija_odrzavanja", referencedColumnName = "idlokacija_odrzavanja", nullable = false,insertable=false, updatable=false)
    private LokacijaOdrzavanjaEntity lokacijaOdrzavanjaByLokacijaOdrzavanjaIdlokacijaOdrzavanja;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kategorija_idkategorija", referencedColumnName = "idkategorija", nullable = false, insertable=false, updatable=false)
    private KategorijaEntity kategorijaByKategorijaIdkategorija;

}
