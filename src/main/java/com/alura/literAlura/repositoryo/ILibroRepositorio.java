package com.alura.literAlura.repositoryo;

import com.alura.literAlura.models.Libro;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ILibroRepositorio extends JpaRepository<Libro, Long> {

    boolean existsByTitulo(String titulo);

    Libro findByTituloContainsIgnoreCase(String titulo);

    List<Libro> findByIdioma(String idioma);



    @Query("SELECT l FROM Libro l JOIN FETCH l.autor ORDER BY l.cantidadDescargas DESC")
    List<Libro> findTop10Libros(Pageable pageable);


}
