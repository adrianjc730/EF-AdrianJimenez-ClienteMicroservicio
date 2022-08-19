package com.idat.EFAdrianJimenezClientemicroservicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EFAdrianJimenezClientemicroservicio.model.Cliente;
import com.idat.EFAdrianJimenezClientemicroservicio.repository.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listar() {
		return repository.findAll();
	}

	@Override
	public void guardar(Cliente cliente) {
		repository.save(cliente);
	}

}
