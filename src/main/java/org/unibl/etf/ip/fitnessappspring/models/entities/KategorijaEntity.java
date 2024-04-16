package org.unibl.etf.ip.fitnessappspring.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "kategorija", schema = "fitnessapp", catalog = "")
public class KategorijaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idkategorija")
    private Integer idkategorija;

    @Basic
    @Column(name = "naziv_kategorija")
    private String nazivKategorija;

    @Basic
    @Column(name = "opis_kategorije")
    private String opisKategorije;

    @OneToMany(mappedBy = "kategorijaByKategorijaIdkategorija")
    @JsonIgnore
    private List<ProgramEntity> programsByIdkategorija;

    @OneToMany(mappedBy = "kategorijaByKategorijaIdkategorija")
    @JsonIgnore
    private List<PretplataEntity> pretplate;

}
