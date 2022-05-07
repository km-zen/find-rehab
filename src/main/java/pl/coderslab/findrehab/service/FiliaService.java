package pl.coderslab.findrehab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.findrehab.entity.Filia;
import pl.coderslab.findrehab.repository.FiliaRepository;


import java.util.List;

@Service
@Transactional
public class FiliaService {
    private final FiliaRepository filiaRepository;

    @Autowired
    public FiliaService(FiliaRepository filiaRepository) {

        this.filiaRepository = filiaRepository;
    }


    public List<Filia> finAllByCityUsingQuery(String city){
       return filiaRepository.findAllByCityUsingQuery(city);
    }

    public List<Filia> findAll(){
        return filiaRepository.findAll();
    }


}
