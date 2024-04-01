package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class UcestvujeRequest {
    private String korisnikJmbg;

    private Integer programIdProgram;

    private Integer nacinPlacanjaIdnacinPlacanja;
    private Boolean instruktor;
}
