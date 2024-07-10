package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.Categoria;
import com.eledu.compras.services.CategoriaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/categorias")
public class CategoriaController extends BaseController<Categoria, CategoriaService> {

    protected CategoriaController(CategoriaService service) {
        super(service);
    }

}
