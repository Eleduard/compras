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
public class UnidadMedida extends Base {

    private String denominacion;
    private String abreviatura;

}