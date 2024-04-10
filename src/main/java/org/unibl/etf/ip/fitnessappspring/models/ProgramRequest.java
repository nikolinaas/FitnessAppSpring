package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.SlikaEntity;

@Data
public class ProgramRequest {
    private String opis;


    private Integer cijena;

    private String nivoTezine;

    private Integer trajanje;

    private String slike;

    private Integer lokacijaOdrzavanjaIdlokacijaOdrzavanja;

    private Integer kategorijaIdkategorija;

    private Boolean online;

    private SlikaEntity slika;

    private Boolean uzivo;

    private String nazivPrograma;
}
