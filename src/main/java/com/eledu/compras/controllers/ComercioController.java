package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.Comercio;
import com.eledu.compras.services.ComercioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/comercios")
public class ComercioController extends BaseController<Comercio, ComercioService> {

    protected ComercioController(ComercioService service) { super(service); }

}
