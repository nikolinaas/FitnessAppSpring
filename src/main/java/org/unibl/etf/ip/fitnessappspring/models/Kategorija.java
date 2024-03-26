package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;

import java.util.List;

@Data
public class Kategorija {

    private Integer idkategorija;

    private String nazivKategorija;

    private String opisKategorije;

    private List<ProgramEntity> programsByIdkategorija;
}
