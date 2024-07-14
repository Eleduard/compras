package com.eledu.compras.services;

import com.eledu.compras.domain.entities.DetalleCompra;
import com.eledu.compras.repositories.DetalleCompraRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleCompraService extends BaseService<DetalleCompra, Long> {

    public DetalleCompraService(DetalleCompraRepository detalleCompraRepository) {
        super(detalleCompraRepository);
    }

}
