package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.base.BaseEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
@Table(name = "logovi", schema = "fitnessapp", catalog = "")
public class LogoviEntity implements BaseEntity<Integer> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "info")
    private String info;
    @Basic
    @Column(name = "datum")
    private String datum;


}
