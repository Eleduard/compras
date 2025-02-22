package com.eledu.compras.controllers;

import com.eledu.compras.domain.entities.Base;
import com.eledu.compras.services.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseController<T extends Base, S extends BaseService<T, Long>> {

    protected final S service;

    protected BaseController(S service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody T entidad) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(entidad));
        } catch(RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody T entidad) {
        try {
            T searchedEntity = service.findById(id);
            if(searchedEntity == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Registro no encontrado.");
            } else {
                entidad.setId(id);
                return ResponseEntity.status(HttpStatus.OK).body(service.save(entidad));
            }
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            T searchedEntity = service.findById(id);
            if(searchedEntity == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Registro no encontrado.");
            } else {
                searchedEntity.setEliminado(true);
                update(searchedEntity.getId(), searchedEntity);
                return ResponseEntity.status(HttpStatus.OK).body("Registro eliminado.");
            }
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
