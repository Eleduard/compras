package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.Marca;
import com.eledu.compras.services.MarcaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/marcas")
public class MarcaController extends BaseController<Marca, MarcaService> {

    protected MarcaController(MarcaService service) {
        super(service);
    }

}
