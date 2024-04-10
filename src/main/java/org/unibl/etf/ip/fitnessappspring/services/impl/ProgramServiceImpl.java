package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.exceptions.NotFoundException;
import org.unibl.etf.ip.fitnessappspring.models.Program;
import org.unibl.etf.ip.fitnessappspring.models.ProgramRequest;
import org.unibl.etf.ip.fitnessappspring.models.SingleProgram;
import org.unibl.etf.ip.fitnessappspring.models.entities.ProgramEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.ProgramEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.ProgramService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProgramServiceImpl extends CrudJPAService<ProgramEntity,Integer> implements ProgramService {

    private final ProgramEntityRepository repository;

    private final ModelMapper modelMapper;

    public ProgramServiceImpl(ProgramEntityRepository repository, ModelMapper modelMapper) {
        super(repository,modelMapper,ProgramEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }



    @Override
    public List<Program> getAllProgramsByLocation(Integer id) {
    return repository.getAllByLokacijaOdrzavanjaIdlokacijaOdrzavanja(id).stream().map(l -> modelMapper.map(l, Program.class)).collect(Collectors.toList());
    }

    @Override
    public byte[] getImageByProgramId(Integer id) {
       ProgramEntity program = repository.getById(id);
       System.out.println(program);
        return new byte[0];
    }


    @Override
    public <T> List<T> findAll(Class<T> resultDtoClass){

        List<ProgramEntity> list = repository.findAll();
        for(ProgramEntity p : list){
            System.out.println(p.getSlike());
        }

       return list.stream().map(l -> modelMapper.map(l, resultDtoClass)).collect(Collectors.toList());

   }



/*
    public ResponseEntity<byte[]> getImage(String imageName){
        File photos = new File(PHOTO_PATH);
        File[] files=photos.listFiles();
        for(int i =0; i<files.length; i++){
            if(files[i].getName().equals(imageName)) {
                String path = PHOTO_PATH + "/" + imageName;
                File file =  new File(path);
                byte[] base64encodedData = new byte[0];

                try {
                    base64encodedData = Base64.getEncoder().encode(Files.readAllBytes(file.toPath()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" +
                                file.getName() + "\"")
                        .body(base64encodedData);
            }
        }
        return null;
    }
*/



}
