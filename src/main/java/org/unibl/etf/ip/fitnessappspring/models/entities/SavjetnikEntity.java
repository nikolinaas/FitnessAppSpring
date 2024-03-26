package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "savjetnik", schema = "fitnessapp", catalog = "")
public class SavjetnikEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "JMBG")
    private String jmbg;
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
    @Column(name = "brTelefona")
    private String brTelefona;
    @Basic
    @Column(name = "adresa")
    private String adresa;
    @Basic
    @Column(name = "nalog_idnalog")
    private Integer nalogIdnalog;
    @OneToMany(mappedBy = "savjetnikBySavjetnikJmbg")
    private List<PorukaEntity> porukasByJmbg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nalog_idnalog", referencedColumnName = "idnalog", nullable = false, insertable=false, updatable=false)
    private NalogEntity nalogByNalogIdnalog;

}