package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class ProgramRequest {
    private String opis;


    private Integer cijena;

    private Integer nivoTezine;

    private Integer trajanje;

    private String slike;

    private Integer lokacijaOdrzavanjaIdlokacijaOdrzavanja;

    private Integer kategorijaIdkategorija;

    private Boolean online;


    private Boolean uzivo;

    private String nazivPrograma;
}
