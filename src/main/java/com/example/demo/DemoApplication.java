package com.example.demo;

import com.example.demo.entities.Car;
import com.example.demo.entities.Exposition;
import com.example.demo.repositories.CarRepository;
import com.example.demo.repositories.ExpRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		CarRepository repository= context.getBean(CarRepository.class);
		ExpRepository repository2= context.getBean(	ExpRepository.class);


		//Crear coche

		Car c1= new Car(null, "Opel", "Insignia", "1234ABC","Paco");
		Car c2= new Car(null, "Jeep", "Renegade", "3456DEF","Sofia");
		Car c3= new Car(null, "Mercedes", "GLA", "6789GHI","Sandra");
		Car c4= new Car(null, "Peugeot", "208", "5544LVF","Marcos");

		repository.save(c1);
		repository.save(c2);
		repository.save(c3);
		repository.save(c4);


		//Crear Exposiciones
		Exposition e1= new Exposition(null, "Madrid",null);
		Exposition e2= new Exposition(null, "Barcelona",null);
		Exposition e3= new Exposition(null, "Talavera",null);
		Exposition e4= new Exposition(null, "Granada",null);
		Exposition e5= new Exposition(null, "Malaga",null);
		Exposition e6= new Exposition(null, "Gerona",null);
		Exposition e7= new Exposition(null, "Sevilla",null);
		Exposition e8= new Exposition(null, "Salamanca",null);



		repository2.save(e1);
		repository2.save(e2);
		repository2.save(e3);
		repository2.save(e4);
		repository2.save(e5);
		repository2.save(e6);
		repository2.save(e7);
		repository2.save(e8);



		//Listar todos los coches.

		System.out.println(" La lista de coches es : "+ repository.findAll());

		//Listar el coche con id = 4

		System.out.println("Coche con id 4: "+repository.findById(4L));


		//Listar el propietario del coche con id = 4


		System.out.println("Propietario del coche con id 4: "+repository.findById(4L).get().getPropietario());

	    //Listar las exposiciones.

		System.out.println("Exposiciones: "+ repository2.findAll());


		//Listar los coches de la exposición numero 8

		System.out.println("Coches de la exposicion numero 8: "+ repository2.findById(8L).get().getCars());



	}

}
