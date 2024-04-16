package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.unibl.etf.ip.fitnessappspring.models.entities.DnevnikAktivnostiEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.NalogEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.PorukaEntity;

import java.util.List;

@Data
public class Korisnik {

    private Integer id;

    private String ime;

    private String prezime;

    private String email;

    private String brojTelefona;

    private String adresa;
    private Integer slikaId;
    private Integer nalogIdnalog;
    private String aktivacioniKod;
    private List<DnevnikAktivnostiEntity> dnevnikAktivnostisByJmbg;
  //  private List<PorukaEntity> porukasByJmbg;
    private String nalogKorisnickoIme;
    private String nalogLozinka;
    private Boolean nalogAktiviran;


}
