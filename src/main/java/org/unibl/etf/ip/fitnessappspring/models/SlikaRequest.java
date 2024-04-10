package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class SlikaRequest {
    private byte[] file;
    private String ime;
    private String tip;
}
