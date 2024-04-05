package org.unibl.etf.ip.fitnessappspring.controllers;

import jakarta.mail.MessagingException;
import jakarta.persistence.EnumType;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.unibl.etf.ip.fitnessappspring.models.KorisnikRequest;
import org.unibl.etf.ip.fitnessappspring.models.RegisterKorinsikRequest;
import org.unibl.etf.ip.fitnessappspring.models.entities.KorisnikEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.KorisnikEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.MailService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/mail/send")
public class MailController {


 private final MailService mailService;
 private final ModelMapper modelMapper;

    public MailController(MailService mailService, ModelMapper modelMapper) {
        this.mailService = mailService;
        this.modelMapper = modelMapper;
    }
    @PostMapping
    void sendMail(@RequestBody KorisnikRequest request)  {
        KorisnikEntity entity = modelMapper.map(request, KorisnikEntity.class);
        try {
            mailService.sendVerificationEmail(entity.getEmail(), entity.getAktivacioniKod());
        }catch (Exception e){
        System.out.println("Mail wasnt sent");
        }

}
}










