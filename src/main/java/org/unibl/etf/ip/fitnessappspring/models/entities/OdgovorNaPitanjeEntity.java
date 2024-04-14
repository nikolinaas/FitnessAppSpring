package org.unibl.etf.ip.fitnessappspring.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.util.Objects;

@Data
@Entity
@Table(name = "odgovor_na_pitanje", schema = "fitnessapp", catalog = "")
public class OdgovorNaPitanjeEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "odgovor_text")
    private String odgovorText;
    @Basic
    @Column(name = "korisnik_id")
    private Integer korisnikId;
    @Basic
    @Column(name = "pitanje_o_programu_id")
    private Integer pitanjeOProgramuId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "korisnik_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    private KorisnikEntity korisnikByKorisnikId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "pitanje_o_programu_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    private PitanjeOProgramuEntity pitanjeOProgramuByPitanjeOProgramuId;
}
