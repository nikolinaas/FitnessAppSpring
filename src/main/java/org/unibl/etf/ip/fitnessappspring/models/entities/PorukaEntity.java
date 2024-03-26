package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@Table(name = "poruka", schema = "fitnessapp", catalog = "")
public class PorukaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idporuka")
    private Integer idporuka;
    @Basic
    @Column(name = "sadrzaj")
    private String sadrzaj;
    @Basic
    @Column(name = "procitana")
    private Boolean procitana;
    @Basic
    @Column(name = "savjetnik_JMBG")
    private String savjetnikJmbg;
    @Basic
    @Column(name = "korisnik_JMBG")
    private String korisnikJmbg;
    @ManyToOne
    @JoinColumn(name = "savjetnik_JMBG", referencedColumnName = "JMBG", nullable = false, insertable=false, updatable=false)
    private SavjetnikEntity savjetnikBySavjetnikJmbg;
    @ManyToOne
    @JoinColumn(name = "korisnik_JMBG", referencedColumnName = "JMBG", nullable = false, insertable=false, updatable=false)
    private KorisnikEntity korisnikByKorisnikJmbg;

}
