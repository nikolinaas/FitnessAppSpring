package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class PorukaKorisnikuRequest {
    private String sadrzaj;
    private Byte procitana;
    private String naslov;
    private Integer korisnikPosiljalacId;
    private Integer korisnikPrimalacId;
}
