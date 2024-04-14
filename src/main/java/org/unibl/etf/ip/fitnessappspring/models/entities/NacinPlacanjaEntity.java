package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "nacin_placanja", schema = "fitnessapp", catalog = "")
public class NacinPlacanjaEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idnacin_placanja")
    private Integer id;

    @Basic
    @Column(name = "naziv")
    private String naziv;

    @OneToMany(mappedBy = "nacinPlacanjaByIdNacinplacanja")
    private List<UcestvujeEntity> naciniPlacanja;
}
