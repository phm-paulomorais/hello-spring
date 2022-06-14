package com.example.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.hello.model.Mensagem;

@Controller
public class Hello {
	
	
	@GetMapping("/hello")
	public ResponseEntity<Mensagem> hello() {
		Mensagem mensagem = new Mensagem("Olá, bem-vindo ao desenvolvimento de REST APIs com Spring!!!");
	    return ResponseEntity.ok(mensagem);
	}

}
