package com.example.demo.Repositorio;

import com.example.demo.Interface.QuadbikeInterface;
import com.example.demo.Modelo.Quadbike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuadbikeRepositorio {

    @Autowired
    private QuadbikeInterface quadbikeCrudRepository;

    public List<Quadbike> getAll() {
        return (List<Quadbike>) quadbikeCrudRepository.findAll();
    }

    public Optional<Quadbike> getQuadbike(int id) {
        return quadbikeCrudRepository.findById(id);
    }

    public Quadbike save(Quadbike quadbike) {
        return quadbikeCrudRepository.save(quadbike);
    }
    
    public void delete(Quadbike quadbike){
        quadbikeCrudRepository.delete(quadbike);
    }
}
