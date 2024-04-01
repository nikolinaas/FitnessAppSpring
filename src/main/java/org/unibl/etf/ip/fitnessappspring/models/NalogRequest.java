package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class NalogRequest {
    private String korisnickoIme;
    private String lozinka;
    private Boolean aktiviran;
}
