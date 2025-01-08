package com.alura.literAlura.service;

import com.alura.literAlura.models.Libro;
import com.alura.literAlura.repositoryo.ILibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class LibroService {


    @Autowired
    private ILibroRepositorio libroRepository;

    public List<Libro> obtenerTop10Libros() {
        Pageable pageable = PageRequest.of(0, 10); // Limita a los primeros 10 libros
        return libroRepository.findTop10Libros(pageable);
    }
//
}
