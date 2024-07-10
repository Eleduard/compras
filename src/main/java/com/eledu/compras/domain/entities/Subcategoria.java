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
public class Subcategoria extends Base {

    private String nombreSubcategoria;

    @ManyToOne
    @JoinColumn(name = "categoria_padre")
    private Categoria categoriaPadre;

}
