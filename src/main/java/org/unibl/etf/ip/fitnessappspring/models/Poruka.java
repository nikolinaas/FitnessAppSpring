package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Poruka {
    private Integer id;

    private String sadrzaj;
    private String naslov;
    private Boolean procitana;

    private Integer savjetnikId;
    private Integer korisnikId;
}
