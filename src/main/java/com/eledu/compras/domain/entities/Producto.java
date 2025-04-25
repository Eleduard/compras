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
    private boolean esSinTacc;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
