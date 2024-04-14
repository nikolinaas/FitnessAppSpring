package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;
import org.unibl.etf.ip.fitnessappspring.models.entities.UcestvujeEntity;

import java.util.List;

@Data
public class NacinPlacanjaRequest {


    private Integer id;

    private String naziv;

    private List<UcestvujeEntity> naciniPlacanja;

}
