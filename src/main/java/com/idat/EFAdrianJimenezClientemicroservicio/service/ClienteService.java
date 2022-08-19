package com.idat.EFAdrianJimenezClientemicroservicio.service;

import java.util.List;

import com.idat.EFAdrianJimenezClientemicroservicio.model.Cliente;

public interface ClienteService {
	List<Cliente> listar();
	void guardar(Cliente cliente);
}
