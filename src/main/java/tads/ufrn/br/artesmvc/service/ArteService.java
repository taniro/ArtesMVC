package tads.ufrn.br.artesmvc.service;

import org.springframework.stereotype.Service;
import tads.ufrn.br.artesmvc.domain.Arte;
import tads.ufrn.br.artesmvc.repository.ArteRepository;

import java.util.List;

@Service
public class ArteService {

    private ArteRepository repository;

    public ArteService(ArteRepository repository) {
        this.repository = repository;
    }

    public Arte insert(Arte a){
        return repository.save(a);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Arte update (Arte a){
        return repository.saveAndFlush(a);
    }

    public List<Arte> listAll(){
        return repository.findAll();
    }







}