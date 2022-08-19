package com.idat.EFAdrianJimenezClientemicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFAdrianJimenezClientemicroservicio.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
