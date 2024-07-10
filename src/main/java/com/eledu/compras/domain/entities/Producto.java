package com.eledu.compras.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Producto extends Base {

    private String nombreProducto;

    @ManyToOne
    @JoinColumn(name = "subcategoria")
    private Subcategoria subcategoria;

    @ManyToMany(mappedBy = "productos", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @Builder.Default
    private Set<Compra> compras = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "marca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "unidad_medida")
    private UnidadMedida unidadMedida;

}
