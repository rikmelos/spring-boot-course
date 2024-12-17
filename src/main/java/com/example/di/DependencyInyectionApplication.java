package com.example.di;

import com.example.di.atributo.Coche;
import com.example.di.atributo.Motor;
import com.example.di.qualifiers.*;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.slf4j.Logger;

@SpringBootApplication
public class DependencyInyectionApplication {

	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class.getName());


	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);

		Nido nido = context.getBean(Nido.class);

		nido.imprimir();
		//log.info("Animal = {} edad={}", animal.getNombre(), animal.getEdad());



		/*Motor motor = new Motor("XL1", 1981);

		Coche coche = new Coche("vw", 1986, motor);

		System.out.println(coche);*/
	}

}
