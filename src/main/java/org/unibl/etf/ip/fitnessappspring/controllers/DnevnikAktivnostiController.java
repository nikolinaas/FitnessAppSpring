package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.ip.fitnessappspring.base.CrudController;
import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.DnevnikAktivnosti;
import org.unibl.etf.ip.fitnessappspring.models.DnevnikAktivnostiRequest;
import org.unibl.etf.ip.fitnessappspring.services.DnevnikAktivnostiService;

@RestController
@RequestMapping("/dnevnikaktivnostii")
public class DnevnikAktivnostiController extends CrudController<Integer, DnevnikAktivnostiRequest, DnevnikAktivnosti> {
    protected DnevnikAktivnostiController(DnevnikAktivnostiService service) {
        super(service, DnevnikAktivnosti.class);
    }
}
