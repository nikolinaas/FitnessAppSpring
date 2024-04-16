package org.unibl.etf.ip.fitnessappspring.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.util.Objects;

@Data
@Entity
@Table(name = "pretplata", schema = "fitnessapp", catalog = "")
public class PretplataEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;


    @Basic
    @Column(name = "kategorija_idkategorija")
    private Integer kategorijaIdkategorija;
    @Basic
    @Column(name = "korisnik_id")
    private Integer korisnikId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "kategorija_idkategorija", referencedColumnName = "idkategorija", nullable = false, insertable=false, updatable=false)
    private KategorijaEntity kategorijaByKategorijaIdkategorija;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "korisnik_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    private KorisnikEntity korisnikByKorisnikId;

}
