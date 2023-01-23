package com.br.exerciciosSb.models;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(2, "Joao Nunes", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria Betania", "555.777.111-22");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Betoven", "111.333.111-55");
	}
	
}
