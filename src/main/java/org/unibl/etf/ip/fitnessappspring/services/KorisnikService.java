package org.unibl.etf.ip.fitnessappspring.services;

import org.unibl.etf.ip.fitnessappspring.base.CrudService;
import org.unibl.etf.ip.fitnessappspring.models.Korisnik;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;

public interface KorisnikService extends CrudService<Integer> {

    KorisnikEntity insert(Korisnik k, KorisnikEntity entclass);
    KorisnikEntity getUserByAccountId(Integer id);
}
