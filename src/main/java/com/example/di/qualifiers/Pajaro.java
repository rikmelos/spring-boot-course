package com.example.di.qualifiers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Component("pajarito")
@Primary
public class Pajaro extends Animal implements Volador{

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public Pajaro(@Value("3") Integer edad, @Value("Pajaro Loco") String nombre) {
        super(edad, nombre);
    }

    @Override
    public void volar() {
        log.info("Soy un pajaro y estoy volando");
    }
}
