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
@Table(name = "nalog", schema = "fitnessapp", catalog = "")
public class NalogEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idnalog")
    private Integer id;
    @Basic
    @Column(name = "korisnicko_ime")
    private String korisnickoIme;
    @Basic
    @Column(name = "lozinka")
    private String lozinka;
    @Basic
    @Column(name = "aktiviran")
    private Boolean aktiviran;
    @Basic
    @Column(name = "aktivacioni_kod")
    private String aktivacioniKod;
 /*   @OneToMany(mappedBy = "nalogByNalogIdnalog")
    @JsonIgnore
    private List<AdministratorEntity> administratorsByIdnalog;*/
    @OneToMany(mappedBy = "nalogByNalogIdnalog")
    @JsonIgnore
    private List<KorisnikEntity> korisniksByIdnalog;
/*    @OneToMany(mappedBy = "nalogByNalogIdnalog")
    @JsonIgnore
    private List<SavjetnikEntity> savjetniksByIdnalog;*/

}
