package com.alura.literAlura;

import com.alura.literAlura.Libreria.Librery;
import com.alura.literAlura.repositoryo.IAutorRepositorio;
import com.alura.literAlura.repositoryo.ILibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraAplication implements CommandLineRunner {

	@Autowired
	private ILibroRepositorio libroRepositorio;
	@Autowired
	private IAutorRepositorio autorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraAplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Librery librery = new Librery(libroRepositorio, autorRepositorio);
		librery.consumo();
	}
}
