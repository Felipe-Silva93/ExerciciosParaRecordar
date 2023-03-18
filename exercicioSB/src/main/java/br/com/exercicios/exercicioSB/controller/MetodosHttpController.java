package br.com.exercicios.exercicioSB.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

	@GetMapping
	public String get() {
		return "request get";
	}
	
	@PostMapping
	public String post() {
		return "request post";
	}
	@PutMapping
	public String put() {
		return "request put";
	}
	@DeleteMapping
	public String delite() {
		return "request delit";
	}
	@PatchMapping
	public String patch() {
		return "request phatc";
	}
}
