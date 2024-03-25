package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "pretpalata_na_kategoriju", schema = "fitnessapp", catalog = "")
@IdClass(org.unibl.etf.ip.fitnessappspring.models.entities.PretpalataNaKategorijuEntityPK.class)
public class PretpalataNaKategorijuEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "kategorija_idkategorija", nullable = false)
    private Integer kategorijaIdkategorija;

    public Integer getKategorijaIdkategorija() {
        return kategorijaIdkategorija;
    }

    public void setKategorijaIdkategorija(Integer kategorijaIdkategorija) {
        this.kategorijaIdkategorija = kategorijaIdkategorija;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "korisnik_JMBG", nullable = false, length = 13)
    private String korisnikJmbg;

    public String getKorisnikJmbg() {
        return korisnikJmbg;
    }

    public void setKorisnikJmbg(String korisnikJmbg) {
        this.korisnikJmbg = korisnikJmbg;
    }

    @Basic
    @Column(name = "nacin_placanja_idnacin_placanja", nullable = false)
    private Integer nacinPlacanjaIdnacinPlacanja;

    public Integer getNacinPlacanjaIdnacinPlacanja() {
        return nacinPlacanjaIdnacinPlacanja;
    }

    public void setNacinPlacanjaIdnacinPlacanja(Integer nacinPlacanjaIdnacinPlacanja) {
        this.nacinPlacanjaIdnacinPlacanja = nacinPlacanjaIdnacinPlacanja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PretpalataNaKategorijuEntity that = (PretpalataNaKategorijuEntity) o;
        return Objects.equals(kategorijaIdkategorija, that.kategorijaIdkategorija) && Objects.equals(korisnikJmbg, that.korisnikJmbg) && Objects.equals(nacinPlacanjaIdnacinPlacanja, that.nacinPlacanjaIdnacinPlacanja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kategorijaIdkategorija, korisnikJmbg, nacinPlacanjaIdnacinPlacanja);
    }
}
