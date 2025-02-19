package com.eledu.compras.controllers;

import com.eledu.compras.domain.dto.TipoProductoDTO;
import com.eledu.compras.domain.entities.TipoProducto;
import com.eledu.compras.services.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tipoproducto")
public class TipoProductoController extends BaseController<TipoProducto, TipoProductoService> {

    @Autowired
    private TipoProductoService tipoProductoService;

    protected TipoProductoController(TipoProductoService service) { super(service); }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<TipoProductoDTO> getById(@PathVariable Long id) {

        TipoProductoDTO tipoProductoDTO = tipoProductoService.obtenerTipoProducto(id);
        return ResponseEntity.ok(tipoProductoDTO);

    }

}
