package com.wintux.ejemplogit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @Value("${DB_PASSWORD}")
    private String password;
    @GetMapping("/hola")
    public String saludar() {
        return "Hola desde Spring Boot  Micky!!";
    }
    @GetMapping("/adios")
    public String despedirse() {
        return "Hasta luego! desde Spring Boot!! usando nueva rama (ej. Pull request)";
    }
    @GetMapping("/hola2")
    public String saludaPersonalizado() {
        System.out.println("El valor de la ENV es: "+password);
        return "Hola "+password+", desde Spring Boot!!";
    }
}
