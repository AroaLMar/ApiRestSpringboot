package com.example.demo.controllers;

import com.example.demo.entities.Car;
import com.example.demo.repositories.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {

    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    //Listar todo

    @GetMapping("/api/cars")
    public List<Car> findAllCars(){

        return carRepository.findAll();

    }

    //Listar por id
    @GetMapping("/api/cars/{id}")
    public Car findCarById(@PathVariable Long id) {

        Optional<Car> carOpt = carRepository.findById(id);

        if(carOpt.isPresent()) return carOpt.get();

        else return null;

    }

    //Listar propietario por coche

    @GetMapping("/api/car/{id}/propietario")
    public void findOwnerByCar(@PathVariable Long id) {
        System.out.println("Propietario coche: "+ carRepository.findById(id).get().getPropietario());
    }


}


