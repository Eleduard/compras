package com.eledu.compras.services;

import com.eledu.compras.domain.entities.UnidadMedida;
import com.eledu.compras.repositories.UnidadMedidaRepository;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaService extends BaseService<UnidadMedida, Long> {

    public UnidadMedidaService(UnidadMedidaRepository unidadMedidaRepository) { super(unidadMedidaRepository); }

}
