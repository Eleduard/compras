package com.eledu.compras.repositories;

import com.eledu.compras.domain.entities.Categoria;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {
}
