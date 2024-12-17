package com.example.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal {

    public Perro(@Value("7")Integer edad, @Value("Rocky")String nombre) {
        super(edad, nombre);
    }
}
