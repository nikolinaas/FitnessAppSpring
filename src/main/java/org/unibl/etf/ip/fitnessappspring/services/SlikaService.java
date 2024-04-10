package org.unibl.etf.ip.fitnessappspring.services;

import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.Slika;

import java.io.IOException;


public interface SlikaService  extends CrudService<Integer> {
    Slika downloadImage(Integer id);
}
