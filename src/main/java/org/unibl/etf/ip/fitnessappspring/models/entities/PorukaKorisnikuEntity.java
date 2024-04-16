package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.util.Objects;

@Data
@Entity
@Table(name = "poruka_korisniku", schema = "fitnessapp", catalog = "")
public class PorukaKorisnikuEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "sadrzaj")
    private String sadrzaj;
    @Basic
    @Column(name = "procitana")
    private Boolean procitana;
    @Basic
    @Column(name = "naslov")
    private String naslov;
    @Basic
    @Column(name = "korisnik_posiljalac_id")
    private Integer korisnikPosiljalacId;
    @Basic
    @Column(name = "korisnik_primalac_id")
    private Integer korisnikPrimalacId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "korisnik_posiljalac_id", referencedColumnName = "id", nullable = false,insertable=false, updatable=false)
    private KorisnikEntity korisnikByKorisnikPosiljalacId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "korisnik_primalac_id", referencedColumnName = "id", nullable = false,insertable=false, updatable=false)
    private KorisnikEntity korisnikByKorisnikPrimalacId;

}
