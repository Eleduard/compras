package com.eledu.compras.services;

import com.eledu.compras.domain.entities.Subcategoria;
import com.eledu.compras.repositories.SubcategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class SubcategoriaService extends BaseService<Subcategoria, Long> {

    public SubcategoriaService(SubcategoriaRepository subcategoriaRepository) {
        super(subcategoriaRepository);
    }

}
