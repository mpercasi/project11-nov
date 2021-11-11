package com.example.spring_practice.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Deporte {
    private int cantJugadores;
    private String nombre;
    private String descripcion;
    private List<Entrenador> entrenadores = new ArrayList<>();
}
