package com.eledu.compras.services;

import com.eledu.compras.domain.entities.Categoria;
import com.eledu.compras.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends BaseService<Categoria, Long> {

    public CategoriaService(CategoriaRepository categoriaRepository) {
        super(categoriaRepository);
    }

}
