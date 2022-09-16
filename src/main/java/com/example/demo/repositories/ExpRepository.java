package com.example.demo.repositories;


import com.example.demo.entities.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpRepository extends JpaRepository<Exposition,Long>{

}
