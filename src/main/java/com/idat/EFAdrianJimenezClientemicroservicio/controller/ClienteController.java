package com.idat.EFAdrianJimenezClientemicroservicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFAdrianJimenezClientemicroservicio.model.Cliente;
import com.idat.EFAdrianJimenezClientemicroservicio.service.ClienteService;

@Controller
@RequestMapping("/api/cliente/v1")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listar(){
		return service.listar();
	}

	@PostMapping("/guardar")
	public  ResponseEntity<Void> guardar(@RequestBody Cliente cliente) {
		service.guardar(cliente);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
}
