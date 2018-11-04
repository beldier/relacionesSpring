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

    @OneToOne(mappedBy = "biblioteca")
    private Direccion direccion;

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

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
