package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "kategorija", schema = "fitnessapp", catalog = "")
public class KategorijaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idkategorija", nullable = false)
    private Integer idkategorija;

    public Integer getIdkategorija() {
        return idkategorija;
    }

    public void setIdkategorija(Integer idkategorija) {
        this.idkategorija = idkategorija;
    }

    @Basic
    @Column(name = "nazivKategorija", nullable = false, length = 45)
    private String nazivKategorija;

    public String getNazivKategorija() {
        return nazivKategorija;
    }

    public void setNazivKategorija(String nazivKategorija) {
        this.nazivKategorija = nazivKategorija;
    }

    @Basic
    @Column(name = "opis_kategorije", nullable = false, length = 150)
    private String opisKategorije;

    public String getOpisKategorije() {
        return opisKategorije;
    }

    public void setOpisKategorije(String opisKategorije) {
        this.opisKategorije = opisKategorije;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KategorijaEntity that = (KategorijaEntity) o;
        return Objects.equals(idkategorija, that.idkategorija) && Objects.equals(nazivKategorija, that.nazivKategorija) && Objects.equals(opisKategorije, that.opisKategorije);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idkategorija, nazivKategorija, opisKategorije);
    }
}
