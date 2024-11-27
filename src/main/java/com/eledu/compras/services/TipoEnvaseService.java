package com.eledu.compras.services;

import com.eledu.compras.domain.entities.TipoEnvase;
import com.eledu.compras.repositories.TipoEnvaseRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoEnvaseService extends BaseService<TipoEnvase, Long> {

    public TipoEnvaseService(TipoEnvaseRepository tipoEnvaseRepository) { super(tipoEnvaseRepository); }

}
