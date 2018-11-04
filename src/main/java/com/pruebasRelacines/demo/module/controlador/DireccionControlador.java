package com.pruebasRelacines.demo.module.controlador;

import com.pruebasRelacines.demo.module.modelo.Biblioteca;
import com.pruebasRelacines.demo.module.modelo.Direccion;
import com.pruebasRelacines.demo.module.repositorio.BibliotecaRepositorio;
import com.pruebasRelacines.demo.module.repositorio.DireccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path="/direccion")
public class DireccionControlador {
    @Autowired
    private DireccionRepositorio direccionRepositorio;
    @RequestMapping(path="/get", method=GET )
    public Iterable<Direccion> getClase(){

        return direccionRepositorio.findAll();
    }

    @RequestMapping(path="/post", method=POST)
    public Direccion ingresar(@RequestBody Direccion clase){
        return direccionRepositorio.save(clase);
    }

}
