package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "lokacija_odrzavanja", schema = "fitnessapp", catalog = "")
public class LokacijaOdrzavanjaEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idlokacija_odrzavanja")
    private Integer id;

    @Basic
    @Column(name = "naziv_lokacije")
    private String nazivLokacije;

 /*   @OneToMany(mappedBy = "lokacijaOdrzavanjaByLokacijaOdrzavanjaIdlokacijaOdrzavanja")
    private List<ProgramEntity> programsByIdlokacijaOdrzavanja;*/

}
