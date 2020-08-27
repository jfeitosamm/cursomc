package com.jorgefeitosa.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jorgefeitosa.cursomc.domain.Cliente;



@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Integer>{

}
