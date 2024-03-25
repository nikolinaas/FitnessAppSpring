package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "poruka", schema = "fitnessapp", catalog = "")
public class PorukaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idporuka", nullable = false)
    private Integer idporuka;

    public Integer getIdporuka() {
        return idporuka;
    }

    public void setIdporuka(Integer idporuka) {
        this.idporuka = idporuka;
    }

    @Basic
    @Column(name = "sadrzaj", nullable = false, length = 245)
    private String sadrzaj;

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    @Basic
    @Column(name = "procitana", nullable = false)
    private Boolean procitana;

    public Boolean getProcitana() {
        return procitana;
    }

    public void setProcitana(Boolean procitana) {
        this.procitana = procitana;
    }

    @Basic
    @Column(name = "savjetnik_JMBG", nullable = false, length = 13)
    private String savjetnikJmbg;

    public String getSavjetnikJmbg() {
        return savjetnikJmbg;
    }

    public void setSavjetnikJmbg(String savjetnikJmbg) {
        this.savjetnikJmbg = savjetnikJmbg;
    }

    @Basic
    @Column(name = "korisnik_JMBG", nullable = false, length = 13)
    private String korisnikJmbg;

    public String getKorisnikJmbg() {
        return korisnikJmbg;
    }

    public void setKorisnikJmbg(String korisnikJmbg) {
        this.korisnikJmbg = korisnikJmbg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PorukaEntity that = (PorukaEntity) o;
        return Objects.equals(idporuka, that.idporuka) && Objects.equals(sadrzaj, that.sadrzaj) && Objects.equals(procitana, that.procitana) && Objects.equals(savjetnikJmbg, that.savjetnikJmbg) && Objects.equals(korisnikJmbg, that.korisnikJmbg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idporuka, sadrzaj, procitana, savjetnikJmbg, korisnikJmbg);
    }
}
