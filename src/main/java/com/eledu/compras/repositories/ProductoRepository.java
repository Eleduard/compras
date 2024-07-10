package com.eledu.compras.repositories;

import com.eledu.compras.domain.entities.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {
}
