package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class LogInRequest {
    private String korisnickoIme;
    private String lozinka;
}
