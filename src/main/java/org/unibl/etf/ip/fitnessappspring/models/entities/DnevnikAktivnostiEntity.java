package org.unibl.etf.ip.fitnessappspring.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "dnevnik_aktivnosti", schema = "fitnessapp", catalog = "")
public class DnevnikAktivnostiEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

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
    @Column(name = "korisnik_id")
    private Integer korisnikId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "korisnik_id", referencedColumnName = "id", nullable = false,insertable=false, updatable=false)
    private KorisnikEntity korisnikByKorisnikId;

}
