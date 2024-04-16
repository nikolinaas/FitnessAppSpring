package org.unibl.etf.ip.fitnessappspring.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.util.Objects;

@Data
@Entity
@Table(name = "poruka", schema = "fitnessapp", catalog = "")
public class PorukaEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idporuka")
    private Integer id;
    @Basic
    @Column(name = "sadrzaj")
    private String sadrzaj;
    @Basic
    @Column(name = "naslov")
    private String naslov;
    @Basic
    @Column(name = "procitana")
    private Boolean procitana;
    @Basic
    @Column(name = "savjetnik_id")
    private Integer savjetnikId;
    @Basic
    @Column(name = "korisnik_id")
    private Integer korisnikId;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "savjetnik_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    private SavjetnikEntity savjetnikBySavjetnikId;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "korisnik_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    private KorisnikEntity korisnikByKorisnikId;

}
