package com.eledu.compras.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Producto extends Base {

    private String descripcion;
    private double cantidadPorEnvase;
    private boolean esSinTacc;

    @ManyToOne
    @JoinColumn(name = "tipo_envase")
    private TipoEnvase tipoEnvase;

    @ManyToOne
    @JoinColumn(name = "tipo_producto")
    private TipoProducto tipoProducto;

    @ManyToOne
    @JoinColumn(name = "marca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "unidad_medida")
    private UnidadMedida unidadMedida;

}
