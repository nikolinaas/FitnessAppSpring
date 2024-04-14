package org.unibl.etf.ip.fitnessappspring.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "pitanje_o_programu", schema = "fitnessapp", catalog = "")
public class PitanjeOProgramuEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "tekst_Pitanja")
    private String tekstPitanja;
    @Basic
    @Column(name = "korisnik_id")
    private Integer korisnikId;
    @Basic
    @Column(name = "program_id_program")
    private Integer programIdProgram;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "korisnik_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    private KorisnikEntity korisnikByKorisnikId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "program_id_program", referencedColumnName = "id_program", nullable = false, insertable=false, updatable=false)
    private ProgramEntity programByProgramIdProgram;

    @OneToMany(mappedBy = "pitanjeOProgramuByPitanjeOProgramuId")
    private List<OdgovorNaPitanjeEntity> odgovori;


}
