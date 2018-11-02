package com.pruebasRelacines.demo.module.controlador;

import com.pruebasRelacines.demo.module.modelo.Biblioteca;
import com.pruebasRelacines.demo.module.repositorio.BibliotecaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path="/biblioteca")
public class BibliotecaControlador {
    @Autowired
    private BibliotecaRepositorio bibliotecaRepositorio;
    @RequestMapping(path="/get", method=GET )
    public Iterable<Biblioteca> getClase(){

        return bibliotecaRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public Biblioteca ingresar(@RequestBody Biblioteca clase){
        return bibliotecaRepositorio.save(clase);
    }

}
