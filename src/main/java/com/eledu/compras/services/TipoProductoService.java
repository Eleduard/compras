package com.eledu.compras.services;

import com.eledu.compras.domain.dto.TipoProductoDTO;
import com.eledu.compras.domain.entities.Categoria;
import com.eledu.compras.domain.entities.TipoProducto;
import com.eledu.compras.repositories.BaseRepository;
import com.eledu.compras.repositories.CategoriaRepository;
import com.eledu.compras.repositories.TipoProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.aspectj.apache.bcel.Repository.getRepository;

@Service
public class TipoProductoService extends BaseService<TipoProducto, Long> {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    TipoProductoRepository tipoProductoRepository;

    public TipoProductoService(TipoProductoRepository tipoProductoRepository) {

        super(tipoProductoRepository);

    }

    private TipoProductoDTO convertirADTO(TipoProducto tipoProducto) {

        TipoProductoDTO tpdto = new TipoProductoDTO();

        tpdto.setId(tipoProducto.getId());
        tpdto.setEliminado(tipoProducto.isEliminado());
        tpdto.setNombreProducto(tipoProducto.getNombreProducto());
        tpdto.setCategoriaId(tipoProducto.getCategoria().getId());

        return tpdto;

    }

    private TipoProducto convertirAEntidad(TipoProductoDTO tipoProductoDTO) {

        TipoProducto tp = new TipoProducto();
        Categoria cat = categoriaRepository.findById(tipoProductoDTO.getCategoriaId())
                .orElseThrow(() -> new RuntimeException("No existe la categoría."));

        tp.setId(tipoProductoDTO.getId());
        tp.setNombreProducto(tipoProductoDTO.getNombreProducto());
        tp.setEliminado(tipoProductoDTO.isEliminado());
        tp.setCategoria(cat);

        return tp;

    }

    public TipoProductoDTO obtenerTipoProducto(Long id) {

        TipoProducto tipoProducto = tipoProductoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe el producto."));
        TipoProductoDTO tipoProductoDTO = convertirADTO(tipoProducto);
        return tipoProductoDTO;

    }

}
