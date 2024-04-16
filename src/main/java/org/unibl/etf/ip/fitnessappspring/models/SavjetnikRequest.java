package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class SavjetnikRequest {
    private String ime;
    private String prezime;
    private String email;
    private String brTelefona;
    private String adresa;
    private Integer nalogIdnalog;
}
