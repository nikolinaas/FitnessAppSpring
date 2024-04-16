package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class PorukaRequest {



    private String sadrzaj;
    private String naslov;
    private Boolean procitana;

    private Integer savjetnikId;
    private Integer korisnikId;
}
