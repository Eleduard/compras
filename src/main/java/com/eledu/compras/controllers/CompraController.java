package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.Compra;
import com.eledu.compras.services.CompraService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/compras")
public class CompraController extends BaseController<Compra, CompraService> {

    protected CompraController(CompraService service) {
        super(service);
    }

}
