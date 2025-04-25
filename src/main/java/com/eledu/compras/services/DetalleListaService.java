package com.eledu.compras.services;

import com.eledu.compras.domain.entities.DetalleLista;
import com.eledu.compras.repositories.DetalleListaRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleListaService extends BaseService<DetalleLista, Long> {

    public DetalleListaService(DetalleListaRepository detalleListaRepository) {
        super(detalleListaRepository);
    }

}
