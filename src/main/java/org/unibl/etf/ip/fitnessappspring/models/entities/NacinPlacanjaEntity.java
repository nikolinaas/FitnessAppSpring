package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "nacin_placanja", schema = "fitnessapp", catalog = "")
public class NacinPlacanjaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idnacin_placanja", nullable = false)
    private Integer idnacinPlacanja;

    public Integer getIdnacinPlacanja() {
        return idnacinPlacanja;
    }

    public void setIdnacinPlacanja(Integer idnacinPlacanja) {
        this.idnacinPlacanja = idnacinPlacanja;
    }

    @Basic
    @Column(name = "naziv", nullable = false, length = 45)
    private String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NacinPlacanjaEntity that = (NacinPlacanjaEntity) o;
        return Objects.equals(idnacinPlacanja, that.idnacinPlacanja) && Objects.equals(naziv, that.naziv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idnacinPlacanja, naziv);
    }
}
