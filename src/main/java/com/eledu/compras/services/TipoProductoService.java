package com.eledu.compras.services;

import com.eledu.compras.domain.entities.TipoProducto;
import com.eledu.compras.repositories.TipoProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoProductoService extends BaseService<TipoProducto, Long> {

    public TipoProductoService(TipoProductoRepository tipoProductoRepository) { super(tipoProductoRepository); }

}
