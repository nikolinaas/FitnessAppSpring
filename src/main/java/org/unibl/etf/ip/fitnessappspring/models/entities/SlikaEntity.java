package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.util.Arrays;
import java.util.Objects;

@Data
@Entity
@Table(name = "slika", schema = "fitnessapp", catalog = "")
public class SlikaEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "file")
    private byte[] file;
    @Basic
    @Column(name = "ime")
    private String ime;
    @Basic
    @Column(name = "tip")
    private String tip;



}
