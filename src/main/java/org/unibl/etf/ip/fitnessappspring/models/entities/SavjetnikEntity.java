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
@Table(name = "savjetnik", schema = "fitnessapp", catalog = "")
public class SavjetnikEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
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
    @Column(name = "br_telefona")
    private String brTelefona;
    @Basic
    @Column(name = "adresa")
    private String adresa;
    @Basic
    @Column(name = "nalog_idnalog")
    private Integer nalogIdnalog;
    @OneToMany(mappedBy = "savjetnikBySavjetnikId")
    private List<PorukaEntity> porukasById;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "nalog_idnalog", referencedColumnName = "idnalog", nullable = false, insertable=false, updatable=false)
    private NalogEntity nalogByNalogIdnalog;

}
