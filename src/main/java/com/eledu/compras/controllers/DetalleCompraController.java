package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.DetalleCompra;
import com.eledu.compras.services.DetalleCompraService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/detalles")
public class DetalleCompraController extends BaseController<DetalleCompra, DetalleCompraService> {

    protected DetalleCompraController(DetalleCompraService service) {
        super(service);
    }

}
