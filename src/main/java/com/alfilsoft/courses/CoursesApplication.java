package com.alfilsoft.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MiControlador {

    @GetMapping("/saludo")
    public String saludar() {
        return "Hola, este es un servicio REST con Spring Boot";
    }

    @PostMapping("/crear")
    public String crearAlgo(@RequestParam String nombre) {
        // Lógica para crear algo con el nombre proporcionado
        return "Se creó algo con el nombre: " + nombre;
    }
}


@SpringBootApplication
public class CoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
	}

}
