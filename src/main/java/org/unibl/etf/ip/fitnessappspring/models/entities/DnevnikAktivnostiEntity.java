package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "dnevnik_aktivnosti", schema = "fitnessapp", catalog = "")
public class DnevnikAktivnostiEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "iddnevnik_aktivnosti", nullable = false)
    private Integer iddnevnikAktivnosti;

    public Integer getIddnevnikAktivnosti() {
        return iddnevnikAktivnosti;
    }

    public void setIddnevnikAktivnosti(Integer iddnevnikAktivnosti) {
        this.iddnevnikAktivnosti = iddnevnikAktivnosti;
    }

    @Basic
    @Column(name = "vrsta_vjezbe", nullable = false, length = 45)
    private String vrstaVjezbe;

    public String getVrstaVjezbe() {
        return vrstaVjezbe;
    }

    public void setVrstaVjezbe(String vrstaVjezbe) {
        this.vrstaVjezbe = vrstaVjezbe;
    }

    @Basic
    @Column(name = "trajanje", nullable = false)
    private Integer trajanje;

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    @Basic
    @Column(name = "intezitet", nullable = false)
    private Integer intezitet;

    public Integer getIntezitet() {
        return intezitet;
    }

    public void setIntezitet(Integer intezitet) {
        this.intezitet = intezitet;
    }

    @Basic
    @Column(name = "datum_zapisa", nullable = false)
    private Timestamp datumZapisa;

    public Timestamp getDatumZapisa() {
        return datumZapisa;
    }

    public void setDatumZapisa(Timestamp datumZapisa) {
        this.datumZapisa = datumZapisa;
    }

    @Basic
    @Column(name = "br_kilograma", nullable = false)
    private Integer brKilograma;

    public Integer getBrKilograma() {
        return brKilograma;
    }

    public void setBrKilograma(Integer brKilograma) {
        this.brKilograma = brKilograma;
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
        DnevnikAktivnostiEntity that = (DnevnikAktivnostiEntity) o;
        return Objects.equals(iddnevnikAktivnosti, that.iddnevnikAktivnosti) && Objects.equals(vrstaVjezbe, that.vrstaVjezbe) && Objects.equals(trajanje, that.trajanje) && Objects.equals(intezitet, that.intezitet) && Objects.equals(datumZapisa, that.datumZapisa) && Objects.equals(brKilograma, that.brKilograma) && Objects.equals(korisnikJmbg, that.korisnikJmbg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iddnevnikAktivnosti, vrstaVjezbe, trajanje, intezitet, datumZapisa, brKilograma, korisnikJmbg);
    }
}
