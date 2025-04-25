package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.Lista;
import com.eledu.compras.services.ListaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/listas")
public class ListaController extends BaseController<Lista, ListaService> {

    protected ListaController(ListaService service) {
        super(service);
    }

}
