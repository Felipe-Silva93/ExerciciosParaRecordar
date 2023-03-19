package br.com.exercicios.exercicioSB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteControler {

	@GetMapping
	public Cliente obterClient() {
		return new Cliente(28,"pedro","123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@ PathVariable int id) {
		return new Cliente(id,"mane","123.456.789-00");
	}
}
