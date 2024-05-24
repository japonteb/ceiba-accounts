package com.ceiba.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("saludar")
    public String saludar() {
        return "Hola mundo desde Spring Boot con microservicios para Javi";
    }
}
