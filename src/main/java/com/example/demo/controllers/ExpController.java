package com.example.demo.controllers;


import com.example.demo.entities.Exposition;
import com.example.demo.repositories.ExpRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;


@RestController
public class ExpController {

    private ExpRepository expRepository;

    public ExpController(ExpRepository expRepository) {
        this.expRepository = expRepository;
    }


    //Listar todo

    @GetMapping("/api/expositions")
    public List<Exposition> findAllExpositions(){

        return expRepository.findAll();

    }

    //Listar por id
    @GetMapping("/api/expositions/{id}")
    public Exposition findExpositionById(@PathVariable Long id) {

        Optional<Exposition> expOpt = expRepository.findById(id);

        if(expOpt.isPresent()) return expOpt.get();

        else return null;

    }

    //Listar coches por exposicion

    @GetMapping("/exposition/{Eid}/car/{Cid}")
    public void findCarByIdExpositionById(@PathVariable Long Eid, @PathVariable Long Cid) {
        System.out.println("Exposicion: " + Eid + "/nCoches: " + Cid);
    }

}
