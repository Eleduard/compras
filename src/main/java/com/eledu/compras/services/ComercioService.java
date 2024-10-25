package com.eledu.compras.services;

import com.eledu.compras.domain.entities.Comercio;
import com.eledu.compras.repositories.ComercioRepository;
import org.springframework.stereotype.Service;

@Service
public class ComercioService extends BaseService<Comercio, Long> {

    public ComercioService(ComercioRepository comercioRepository) { super(comercioRepository); }

}
