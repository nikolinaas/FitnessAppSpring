package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Logovi {
    private Integer id;
    private String info;
    private String datum;
}
