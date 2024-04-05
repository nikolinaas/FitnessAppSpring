package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.DnevnikAktivnostiEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.NalogEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.PorukaEntity;

import java.util.List;

@Data
public class KorisnikRequest {


    private String ime;

    private String prezime;

    private String email;

    private String brojTelefona;

    private String adresa;

    private Integer nalogIdnalog;
    private String aktivacioniKod;

}
