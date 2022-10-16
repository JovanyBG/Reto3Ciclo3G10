package com.example.demo.Controlador;

import com.example.demo.Modelo.Quadbike;
import com.example.demo.Servicio.QuadbikeServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Quadbike")
@CrossOrigin(origins = "*")
public class QuadbikeControlador {

    @Autowired
    private QuadbikeServicio quadbikeService;

    @GetMapping("/all")
    public List<Quadbike> getQuadbikes() {
        return quadbikeService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Quadbike> getQuadbike(@PathVariable("id") int Id) {
        return quadbikeService.getQuadbike(Id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Quadbike save(@RequestBody Quadbike quadbike) {
        return quadbikeService.save(quadbike);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Quadbike update(@RequestBody Quadbike quadbike) {
        return quadbikeService.update(quadbike);
    }

    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int quadbikeId){
        return quadbikeService.deleteQuadbike(quadbikeId);
    }

}