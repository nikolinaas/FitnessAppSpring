package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "lokacija_odrzavanja", schema = "fitnessapp", catalog = "")
public class LokacijaOdrzavanjaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idlokacija_odrzavanja", nullable = false)
    private Integer idlokacijaOdrzavanja;

    public Integer getIdlokacijaOdrzavanja() {
        return idlokacijaOdrzavanja;
    }

    public void setIdlokacijaOdrzavanja(Integer idlokacijaOdrzavanja) {
        this.idlokacijaOdrzavanja = idlokacijaOdrzavanja;
    }

    @Basic
    @Column(name = "nazivLokacije", nullable = false, length = 50)
    private String nazivLokacije;

    public String getNazivLokacije() {
        return nazivLokacije;
    }

    public void setNazivLokacije(String nazivLokacije) {
        this.nazivLokacije = nazivLokacije;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LokacijaOdrzavanjaEntity that = (LokacijaOdrzavanjaEntity) o;
        return Objects.equals(idlokacijaOdrzavanja, that.idlokacijaOdrzavanja) && Objects.equals(nazivLokacije, that.nazivLokacije);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idlokacijaOdrzavanja, nazivLokacije);
    }
}
