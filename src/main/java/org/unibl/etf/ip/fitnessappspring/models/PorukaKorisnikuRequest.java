package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class PorukaKorisnikuRequest {
    private String sadrzaj;
    private Boolean procitana;
    private String naslov;
    private Integer korisnikPosiljalacId;
    private Integer korisnikPrimalacId;
}
