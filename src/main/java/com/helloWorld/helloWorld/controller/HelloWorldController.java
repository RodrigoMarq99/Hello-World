package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	@GetMapping("/bsm")
	public String bSM() {
		return "HABILIDADES:\n"
				+ "Trabalho em equipe\n"
				+ "Atenção aos detalhes\n"
				+ "Proatividade\n"
				+ "Comunicação\n\n"
				+ "MENTALIDADES:\n"
				+ "Orientação ao futuro\n"
				+ "Responsabilidade pessoal\n"
				+ "Mentalidade de crescimento\n"
				+ "Persistência";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Aprender Spring da melhor maneira possível!";
	}
	
}
