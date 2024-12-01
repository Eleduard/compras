package com.eledu.compras.services;

import com.eledu.compras.domain.entities.Base;
import com.eledu.compras.repositories.BaseRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

public abstract class BaseService<T extends Base, ID extends Serializable> {

    protected final BaseRepository<T, ID> baseRepository;

    public BaseService(BaseRepository<T, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Transactional(readOnly = true)
    public List<T> findAll() throws Exception {
        try {
            return baseRepository.findAll();
        } catch(Exception e) {
            throw new Exception("Error al obtener las entidades: " + e.getMessage());
        }
    }

    @Transactional(readOnly = true)
    public T findById(ID id) throws Exception {
        try {
            return baseRepository.findById(id).orElseThrow(() -> new Exception("El registro con id " + id + " no existe."));
        } catch(Exception e) {
            throw new Exception("Error al obtener el registro: " + e.getMessage());
        }
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public T save(T entidad) {
        try {
            return baseRepository.save(entidad);
        } catch(RuntimeException e) {
            throw new RuntimeException("No se pudo grabar el registro: " + e.getMessage());
        }
    }

    /*@Transactional(rollbackFor = RuntimeException.class)
    public T update(T entidad) {
        try {
            return baseRepository.save(entidad);
        } catch(Exception e) {
            throw new RuntimeException("No se pudo grabar el registro: " + e.getMessage());
        }
    }*/

    @Transactional(rollbackFor = RuntimeException.class)
    public boolean delete(ID id) {
        try {
            T entidad = baseRepository.findById(id).orElseThrow(() -> new Exception("El registro con id " + id + " no existe."));

            baseRepository.delete(entidad);

            return true;
        } catch(Exception e) {
            throw new RuntimeException("No se pudo eliminar el registro: " + e.getMessage());
        }
    }

}
