package org.unibl.etf.ip.fitnessappspring.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.Slika;
import org.unibl.etf.ip.fitnessappspring.models.entities.SlikaEntity;

import java.io.IOException;


public interface SlikaService  extends CrudService<Integer> {
    Slika uploadImage(MultipartFile file) throws IOException;

    Slika downloadImage(Integer id);
}
