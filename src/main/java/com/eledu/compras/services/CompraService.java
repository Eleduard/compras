package com.eledu.compras.services;

import com.eledu.compras.domain.entities.Compra;
import com.eledu.compras.repositories.CompraRepository;
import org.springframework.stereotype.Service;

@Service
public class CompraService extends BaseService<Compra, Long> {

    public CompraService(CompraRepository compraRepository) {
        super(compraRepository);
    }

}
