package org.unibl.etf.ip.fitnessappspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.KategorijaEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;

@Data
public class Pretplata {

    private Integer id;
    private Integer kategorijaIdkategorija;
    private Integer korisnikId;


}
