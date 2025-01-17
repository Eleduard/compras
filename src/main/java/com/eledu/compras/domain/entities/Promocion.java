package com.eledu.compras.domain.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Promocion extends Base {

    private String descripcion;
    private double indice;

}
