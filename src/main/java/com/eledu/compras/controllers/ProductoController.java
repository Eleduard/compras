package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.Producto;
import com.eledu.compras.services.ProductoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/productos")
public class ProductoController extends BaseController<Producto, ProductoService> {

    protected ProductoController(ProductoService service) {
        super(service);
    }

}
