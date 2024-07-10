package com.eledu.compras.services;

import com.eledu.compras.domain.entities.Marca;
import com.eledu.compras.repositories.MarcaRepository;
import org.springframework.stereotype.Service;

@Service
public class MarcaService extends BaseService<Marca, Long> {

    public MarcaService(MarcaRepository marcaRepository) { super(marcaRepository); }

}
