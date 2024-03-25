package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "nalog", schema = "fitnessapp", catalog = "")
public class NalogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idnalog", nullable = false)
    private Integer idnalog;

    public Integer getIdnalog() {
        return idnalog;
    }

    public void setIdnalog(Integer idnalog) {
        this.idnalog = idnalog;
    }

    @Basic
    @Column(name = "korisnicko_ime", nullable = false, length = 45)
    private String korisnickoIme;

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    @Basic
    @Column(name = "lozinka", nullable = false, length = 45)
    private String lozinka;

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Basic
    @Column(name = "aktiviran", nullable = true)
    private Boolean aktiviran;

    public Boolean getAktiviran() {
        return aktiviran;
    }

    public void setAktiviran(Boolean aktiviran) {
        this.aktiviran = aktiviran;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NalogEntity that = (NalogEntity) o;
        return Objects.equals(idnalog, that.idnalog) && Objects.equals(korisnickoIme, that.korisnickoIme) && Objects.equals(lozinka, that.lozinka) && Objects.equals(aktiviran, that.aktiviran);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idnalog, korisnickoIme, lozinka, aktiviran);
    }
}
