package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.AdministratorEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.SavjetnikEntity;

import java.util.List;

@Data
public class Nalog {

    private Integer id;
    private String korisnickoIme;
    private String lozinka;
    private Boolean aktiviran;
/*    private List<AdministratorEntity> administratorsByIdnalog;*/
 //   private List<KorisnikEntity> korisniksByIdnalog;
/*    private List<SavjetnikEntity> savjetniksByIdnalog;*/
}
