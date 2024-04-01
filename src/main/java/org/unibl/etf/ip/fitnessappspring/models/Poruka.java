package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Poruka {
    private Integer idporuka;

    private String sadrzaj;

    private Boolean procitana;

    private String savjetnikJmbg;

    private String korisnikJmbg;
}
