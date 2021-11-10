package com.projetoonefeign1.projetoonefeign1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetoonefeign1.projetoonefeign1.domain.Contato;

@RestController
@RequestMapping("contato")
public class AgendaController {

	@GetMapping
	public ResponseEntity<Contato> retornaContato() {
		return ResponseEntity.ok().body(Contato.builder()
				.id(1l)
				.nome("Jose")
				.telefone("34 9987609898")
				.build());
	}
	
}
