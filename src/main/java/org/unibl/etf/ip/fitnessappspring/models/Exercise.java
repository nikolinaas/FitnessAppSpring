package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;

@Data
public class Exercise {

    public  Exercise(){}

    private String name;
    private String type;
    private String muscle;
    private String equipment;
    private String difficulty;
    private String instructions;
}
