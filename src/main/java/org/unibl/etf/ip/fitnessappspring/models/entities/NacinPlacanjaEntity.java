package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@Table(name = "nacin_placanja", schema = "fitnessapp", catalog = "")
public class NacinPlacanjaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idnacin_placanja")
    private Integer idnacinPlacanja;

    @Basic
    @Column(name = "naziv")
    private String naziv;

}
