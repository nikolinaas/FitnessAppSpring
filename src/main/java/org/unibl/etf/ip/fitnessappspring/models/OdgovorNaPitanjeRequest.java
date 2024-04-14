package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class OdgovorNaPitanjeRequest {
    private Integer id;
    private String odgovorText;
    private Integer korisnikId;
    private Integer pitanjeOProgramuId;
}
