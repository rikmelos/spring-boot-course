package com.example.di.qualifiers;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Component
public class Avion implements Volador{

    private static final Logger log = LoggerFactory.getLogger(Avion.class);

    @Override
    public void volar() {
        log.info("Soy un avion y estoy volando");
    }
}
