package com.pruebasRelacines.demo.module.modelo;

import javax.persistence.*;

@Entity
@Table(name = "biblioteca")

public class Biblioteca {
    @Id
    @Column(name = "id")//se debe especificar cuando nombreVariable != nombreColumna
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
