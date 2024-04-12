package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.ProgramRequest;
import org.unibl.etf.ip.fitnessappspring.models.Slika;
import org.unibl.etf.ip.fitnessappspring.models.SlikaRequest;
import org.unibl.etf.ip.fitnessappspring.services.ProgramService;
import org.unibl.etf.ip.fitnessappspring.services.SlikaService;

import java.io.IOException;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/images")
public class SlikaController extends CrudController<Integer, SlikaRequest, Slika> {

    private final SlikaService slikaService;
    protected SlikaController(SlikaService slikaService) {
        super(slikaService, Slika.class);
        this.slikaService = slikaService;
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<?> downloadImage(@PathVariable Integer id) throws IOException {
        var image = slikaService.downloadImage(id);
        return ResponseEntity.ok().contentType(MediaType.parseMediaType(image.getTip()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + image.getIme() + "\"")
                .body(image.getFile());
    }

    @PostMapping
    public Slika uploadImage(@RequestParam("image") MultipartFile file) throws IOException{
        return this.slikaService.uploadImage(file);
    }
}
