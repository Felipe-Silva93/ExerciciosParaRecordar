package br.com.exercicios.exercicioSB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class Controller {
	
	@GetMapping
	public String ola() {
		return"ola spring";
	}
}
