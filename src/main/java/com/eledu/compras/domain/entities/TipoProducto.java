package com.eledu.compras.domain.entities;

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
public class TipoProducto extends Base {

    private String nombreProducto;

    @ManyToOne
    @JoinColumn(name = "categoria")
    private Categoria categoria;

}
