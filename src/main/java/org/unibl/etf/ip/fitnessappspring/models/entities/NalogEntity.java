package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "nalog", schema = "fitnessapp", catalog = "")
public class NalogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idnalog")
    private Integer idnalog;
    @Basic
    @Column(name = "korisnicko_ime")
    private String korisnickoIme;
    @Basic
    @Column(name = "lozinka")
    private String lozinka;
    @Basic
    @Column(name = "aktiviran")
    private Boolean aktiviran;
    @OneToMany(mappedBy = "nalogByNalogIdnalog")
    private List<AdministratorEntity> administratorsByIdnalog;
    @OneToMany(mappedBy = "nalogByNalogIdnalog")
    private List<KorisnikEntity> korisniksByIdnalog;
    @OneToMany(mappedBy = "nalogByNalogIdnalog")
    private List<SavjetnikEntity> savjetniksByIdnalog;

}
