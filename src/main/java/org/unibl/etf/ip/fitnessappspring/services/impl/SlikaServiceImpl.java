package org.unibl.etf.ip.fitnessappspring.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.unibl.etf.ip.fitnessappspring.base.CrudJPAService;
import org.unibl.etf.ip.fitnessappspring.models.Slika;
import org.unibl.etf.ip.fitnessappspring.models.entities.SlikaEntity;
import org.unibl.etf.ip.fitnessappspring.repositories.SlikaEntityRepository;
import org.unibl.etf.ip.fitnessappspring.services.SlikaService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
@Transactional
public class SlikaServiceImpl extends CrudJPAService<SlikaEntity,Integer> implements SlikaService {

    @Value("${spring.servlet.multipart.location}")
    private String FOLDER_PATH;

    private final SlikaEntityRepository repository;
    private final ModelMapper modelMapper;
    @PersistenceContext
    private EntityManager entityManager;

    private File path;
    public SlikaServiceImpl(SlikaEntityRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper, SlikaEntity.class);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    public void init() throws IOException {
        ClassPathResource imgPath = new ClassPathResource("");


        this.path =new File(imgPath.getFile().getAbsolutePath() + File.separator + FOLDER_PATH);/*new File(resourceLoader.getResource("classpath:store/").getFile().toString() + File.separator + FOLDER_PATH);*/
        System.out.println(this.path.getAbsolutePath());
        if (!path.exists())
            path.mkdir();
//        this.path = htmlPath.getFile();/*new File(resourceLoader.getResource("classpath:store/").getFile().toString() + File.separator + FOLDER_PATH);*/
//        System.out.println(this.path.getAbsolutePath());
//        if (!path.exists())
//            path.mkdir();
    }
    @Override
    public Slika uploadImage(MultipartFile file) throws IOException {
        var name = StringUtils.cleanPath(file.getOriginalFilename());
        var image = SlikaEntity.builder().ime(name).tip(file.getContentType()).file(file.getBytes()).build();
        repository.saveAndFlush(image);
        entityManager.refresh(image);//dobio sam id od baze sada cuvamo na fajl sistemu
        Files.write(Path.of(getPath(image)), file.getBytes());
       // logService.info("New image uploaded! Name: " + name);
        Slika res = modelMapper.map(image,Slika.class);
        return res;
    }
    @Override
    public Slika downloadImage(Integer id) {
        SlikaEntity image = repository.getById(id);
        var path = getPath(image);
        Path pathToFile = Paths.get(path);


        byte[] data = new byte[0];
        try {
            data = Files.readAllBytes(pathToFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Slika imageDto = modelMapper.map(image, Slika.class);
        imageDto.setFile(data);
      //  logService.info("New image downloaded! Address: " + request.getRemoteAddr());
        return imageDto;
    }
    private String getPath(SlikaEntity image) {
        var tmp = image.getTip().split("/");
        System.out.println(tmp[1]);
        var name = image.getId() + "." + tmp[1];
        var file = this.path + File.separator + name; // /images/id.png npr
        return file;
    }
}
