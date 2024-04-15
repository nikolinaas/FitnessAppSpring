package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PorukaKorisniku {
    private Integer id;
    private String sadrzaj;
    private Byte procitana;
    private String naslov;
    private Integer korisnikPosiljalacId;
    private Integer korisnikPrimalacId;
    private String korisnikPosiljalacIme;
    private String korisnikPosiljalacPrezime;
}
