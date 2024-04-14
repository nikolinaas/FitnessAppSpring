package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class OdgovorNaPitanje {
    private Integer id;
    private String odgovorText;
    private Integer korisnikId;
    private Integer pitanjeOProgramuId;
    private String korisnikIme;
    private String korisnikPrezime;
}
