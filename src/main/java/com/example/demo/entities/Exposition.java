package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;


@Entity
    public class Exposition {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;
        private String ciudad;
        private ArrayList<Car> cars;



        public Exposition() {
        }

    public Exposition(Long id, String ciudad,ArrayList<Car> cars) {
          this.id = id;
          this.ciudad=ciudad;
          this.cars= new ArrayList<>();

        }

    public Long getId() {
        return id;
    }

    public void setEId(Long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Exposition{" +
                "id=" + id +
                ", ciudad=" + ciudad +
                '}';
    }
}
