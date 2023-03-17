package br.com.exercicios.exercicioSB.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping
	public String ola() {
		return"ola spring";
	}
}
