package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.TipoEnvase;
import com.eledu.compras.services.TipoEnvaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tipoenvase")
public class TipoEnvaseController extends BaseController<TipoEnvase, TipoEnvaseService> {

    protected TipoEnvaseController(TipoEnvaseService service) { super(service); }

}
