package com.teste.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.api.dto.PersonDTO;

@RestController
@RequestMapping("/api/test")

public class PersonController {
    
    @PostMapping
    public void create(@RequestBody PersonDTO req) {
        System.out.print(req.fabricante());
    }
}
