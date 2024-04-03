package org.unibl.etf.ip.fitnessappspring.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@Table(name = "ucestvuje", schema = "fitnessapp", catalog = "")
public class UcestvujeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "korisnik_id")
    private Integer korisnikId;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "program_id_program", referencedColumnName = "id_program", nullable = false, insertable=false, updatable=false)
    private ProgramEntity programByProgramIdProgram;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "nacin_placanja_idnacin_placanja", referencedColumnName = "idnacin_placanja", nullable = false, insertable=false, updatable=false)
    private NacinPlacanjaEntity nacinPlacanjaByIdNacinplacanja;


}
