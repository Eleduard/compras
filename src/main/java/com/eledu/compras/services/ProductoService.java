package com.eledu.compras.services;

import com.eledu.compras.domain.entities.Producto;
import com.eledu.compras.repositories.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto, Long> {

    public ProductoService(ProductoRepository productoRepository) {
        super(productoRepository);
    }

}
