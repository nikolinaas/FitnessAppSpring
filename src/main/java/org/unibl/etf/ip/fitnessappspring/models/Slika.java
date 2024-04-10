package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Slika {
    private Integer id;
    private byte[] file;
    private String ime;
    private String tip;

}
