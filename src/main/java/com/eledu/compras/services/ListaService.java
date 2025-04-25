package com.eledu.compras.services;

import com.eledu.compras.domain.entities.Lista;
import com.eledu.compras.repositories.ListaRepository;
import org.springframework.stereotype.Service;

@Service
public class ListaService extends BaseService<Lista, Long> {

    public ListaService(ListaRepository listaRepository) {
        super(listaRepository);
    }

}
