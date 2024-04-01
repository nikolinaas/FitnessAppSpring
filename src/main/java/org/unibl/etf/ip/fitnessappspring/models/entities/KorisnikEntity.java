package org.unibl.etf.ip.fitnessappspring.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "korisnik", schema = "fitnessapp", catalog = "")
public class KorisnikEntity implements BaseEntity<String> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "JMBG")
    private String id;

    @Basic
    @Column(name = "ime")
    private String ime;

    @Basic
    @Column(name = "prezime")
    private String prezime;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "broj_telefona")
    private String brojTelefona;

    @Basic
    @Column(name = "adresa")
    private String adresa;

    @Basic
    @Column(name = "nalog_idnalog")
    private Integer nalogIdnalog;

    @OneToMany(mappedBy = "korisnikByKorisnikJmbg", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<DnevnikAktivnostiEntity> dnevnikAktivnostisByJmbg;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nalog_idnalog", referencedColumnName = "idnalog", nullable = false, insertable=false, updatable=false)
    @JsonIgnore
    private NalogEntity nalogByNalogIdnalog;
    @OneToMany(mappedBy = "korisnikByKorisnikJmbg")
    private List<PorukaEntity> porukasByJmbg;

}
