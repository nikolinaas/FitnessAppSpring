package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.KategorijaEntity;
import org.unibl.etf.ip.fitnessappspring.models.entities.LokacijaOdrzavanjaEntity;


@Data
public class Program {

    private Integer idProgram;

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
 /*   private LokacijaOdrzavanjaEntity lokacijaOdrzavanjaByLokacijaOdrzavanjaIdlokacijaOdrzavanja;  TODO ovako je kad mapiram kao objekat tog entiteta
    private KategorijaEntity kategorijaByKategorijaIdkategorija;*/

    private String lokacijaOdrzavanjaNazivLokacije;
    private String kategorijaNazivKategorija;
    private String kategorijaOpisKategorije;
}
