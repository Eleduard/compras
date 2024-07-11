package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.UnidadMedida;
import com.eledu.compras.services.UnidadMedidaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/unidades")
public class UnidadMedidaController extends BaseController<UnidadMedida, UnidadMedidaService> {

    protected UnidadMedidaController(UnidadMedidaService service) {
        super(service);
    }

}
