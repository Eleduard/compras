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
public class Comercio extends Base {

    private String nombre;
    private String notas;

}
