package com.eledu.compras.services;

import com.eledu.compras.domain.entities.Promocion;
import com.eledu.compras.repositories.PromocionRepository;
import org.springframework.stereotype.Service;

@Service
public class PromocionService extends BaseService<Promocion, Long> {

    public PromocionService(PromocionRepository promocionRepository) { super(promocionRepository); }

}
