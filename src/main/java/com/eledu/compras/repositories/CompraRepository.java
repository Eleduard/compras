package com.eledu.compras.repositories;

import com.eledu.compras.domain.entities.Compra;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends BaseRepository<Compra, Long> {
}
