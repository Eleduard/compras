package com.eledu.compras.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class DetalleLista extends Base {

    private double cantidadAComprar;
    private double cantidadComprada;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "lista_id")
    @JsonBackReference
    private Lista lista;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

}
