package com.pruebasRelacines.demo.module.repositorio;

import com.pruebasRelacines.demo.module.modelo.Biblioteca;
import org.springframework.data.repository.CrudRepository;

public interface BibliotecaRepositorio extends CrudRepository<Biblioteca, Long> {
}
