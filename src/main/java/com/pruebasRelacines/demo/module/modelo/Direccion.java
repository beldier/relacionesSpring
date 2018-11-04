package com.pruebasRelacines.demo.module.modelo;

import javax.persistence.*;

@Entity
@Table ( name ="direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String direccion;
    @OneToOne
    @JoinColumn(name = "id_biblioteca")
    private Biblioteca biblioteca;

   /* public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
