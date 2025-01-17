package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.TipoProducto;
import com.eledu.compras.services.TipoProductoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tipoproducto")
public class TipoProductoController extends BaseController<TipoProducto, TipoProductoService> {

    protected TipoProductoController(TipoProductoService service) { super(service); }

}
