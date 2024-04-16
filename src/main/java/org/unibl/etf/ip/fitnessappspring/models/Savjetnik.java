package org.unibl.etf.ip.fitnessappspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.NalogEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.PorukaEntity;

import java.util.List;

@Data
public class Savjetnik {
    private Integer id;
    private String ime;
    private String prezime;
    private String email;
    private String brTelefona;
    private String adresa;
    private Integer nalogIdnalog;

}
