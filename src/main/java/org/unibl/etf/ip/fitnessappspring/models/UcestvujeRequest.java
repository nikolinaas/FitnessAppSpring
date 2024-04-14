package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class UcestvujeRequest {
    private Integer korisnikId;

    private Integer programIdProgram;

    private Integer nacinPlacanjaIdnacinPlacanja;
    private Boolean instruktor;
}
