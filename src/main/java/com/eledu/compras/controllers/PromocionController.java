package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.Promocion;
import com.eledu.compras.services.PromocionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/promociones")
public class PromocionController extends BaseController<Promocion, PromocionService> {

    protected PromocionController(PromocionService service) { super(service); }

}
