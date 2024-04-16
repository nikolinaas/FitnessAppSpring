package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.util.List;

@Data
@Entity
@Table(name = "program", schema = "fitnessapp", catalog = "")
public class ProgramEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_program")
    private Integer id;

    @Basic
    @Column(name = "opis")
    private String opis;

    @Basic
    @Column(name = "cijena")
    private Integer cijena;

    @Basic
    @Column(name = "nivo_tezine")
    private String nivoTezine;

    @Basic
    @Column(name = "trajanje")
    private Integer trajanje;

    @Basic
    @Column(name = "slike")
    private byte[] slike;

    @Basic
    @Column(name = "lokacija_odrzavanja_idlokacija_odrzavanja")
    private Integer lokacijaOdrzavanjaIdlokacijaOdrzavanja;

    @Basic
    @Column(name = "kategorija_idkategorija")
    private Integer kategorijaIdkategorija;

    @Basic
    @Column(name = "online")
    private Boolean online;

    @Basic
    @Column(name = "uzivo")
    private Boolean uzivo;

    @Basic
    @Column(name = "naziv_programa")
    private String nazivPrograma;

    @Basic
    @Column(name = "video")
    private String video;
    @Basic
    @Column(name = "slika_id")
    private Integer slikaId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lokacija_odrzavanja_idlokacija_odrzavanja", referencedColumnName = "idlokacija_odrzavanja", nullable = false,insertable=false, updatable=false)
    private LokacijaOdrzavanjaEntity lokacijaOdrzavanjaByLokacijaOdrzavanjaIdlokacijaOdrzavanja;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kategorija_idkategorija", referencedColumnName = "idkategorija", nullable = false, insertable=false, updatable=false)
    private KategorijaEntity kategorijaByKategorijaIdkategorija;
    @OneToMany(mappedBy = "programByProgramIdProgram")
    private List<UcestvujeEntity> ucestvovanja;
    @OneToMany(mappedBy = "programByProgramIdProgram")
    private List<PitanjeOProgramuEntity> pitanja;

}
