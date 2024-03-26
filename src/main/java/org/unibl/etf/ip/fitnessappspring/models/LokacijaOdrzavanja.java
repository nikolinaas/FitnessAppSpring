package org.unibl.etf.ip.fitnessappspring.models;

import jakarta.persistence.*;
import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;

import java.util.List;

@Data
public class LokacijaOdrzavanja {


    private Integer idlokacijaOdrzavanja;

    private String nazivLokacije;

    private List<ProgramEntity> programsByIdlokacijaOdrzavanja;
}
