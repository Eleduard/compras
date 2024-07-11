package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.Subcategoria;
import com.eledu.compras.services.SubcategoriaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/subcategorias")
public class SubcategoriaController extends BaseController<Subcategoria, SubcategoriaService> {

    protected SubcategoriaController(SubcategoriaService service) {
        super(service);
    }

}
