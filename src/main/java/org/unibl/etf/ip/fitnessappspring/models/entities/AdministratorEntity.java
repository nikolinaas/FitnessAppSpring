package org.unibl.etf.ip.fitnessappspring.models.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "administrator", schema = "fitnessapp", catalog = "")
public class AdministratorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ime", nullable = false, length = 45)
    private String ime;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Basic
    @Column(name = "prezime", nullable = false, length = 45)
    private String prezime;

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "broj_telefona", nullable = false, length = 45)
    private String brojTelefona;

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    @Basic
    @Column(name = "nalog_idnalog", nullable = false)
    private Integer nalogIdnalog;

    public Integer getNalogIdnalog() {
        return nalogIdnalog;
    }

    public void setNalogIdnalog(Integer nalogIdnalog) {
        this.nalogIdnalog = nalogIdnalog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministratorEntity that = (AdministratorEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(ime, that.ime) && Objects.equals(prezime, that.prezime) && Objects.equals(email, that.email) && Objects.equals(brojTelefona, that.brojTelefona) && Objects.equals(nalogIdnalog, that.nalogIdnalog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ime, prezime, email, brojTelefona, nalogIdnalog);
    }
}
