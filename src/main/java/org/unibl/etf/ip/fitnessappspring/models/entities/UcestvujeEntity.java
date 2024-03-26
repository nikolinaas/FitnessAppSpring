package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@Table(name = "ucestvuje", schema = "fitnessapp", catalog = "")
public class UcestvujeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "korisnik_JMBG")
    private String korisnikJmbg;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "program_id_program")
    private Integer programIdProgram;

    @Basic
    @Column(name = "nacin_placanja_idnacin_placanja")
    private Integer nacinPlacanjaIdnacinPlacanja;

    @Basic
    @Column(name = "instruktor")
    private Boolean instruktor;

}
