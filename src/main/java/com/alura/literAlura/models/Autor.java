package com.alura.literAlura.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Integer cumpleanios;

    private Integer fechaFallecimiento;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private List<com.alura.literAlura.models.Libro> libros;

    public Autor(){}

    public Autor(com.alura.literAlura.models.records.Autor autor) {}

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCumpleanios() {
        return cumpleanios;
    }

    public Integer getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    public List<com.alura.literAlura.models.Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<com.alura.literAlura.models.Libro> libros) {
        this.libros = libros;
    }

    public Autor(Autor autor) {
        this.nombre = autor.nombre;
        this.cumpleanios = autor.cumpleanios;
        this.fechaFallecimiento = autor.fechaFallecimiento;
    }

    @Override
    public String toString() {
        return
                        "nombre='" + nombre + '\'' +
                        ", cumpleanios=" + cumpleanios +
                        ", fechaFallecimiento=" + fechaFallecimiento;
    }
}
