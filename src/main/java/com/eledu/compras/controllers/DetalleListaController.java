package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.DetalleLista;
import com.eledu.compras.services.DetalleListaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/detalles")
public class DetalleListaController extends BaseController<DetalleLista, DetalleListaService> {

    protected DetalleListaController(DetalleListaService service) {
        super(service);
    }

}
