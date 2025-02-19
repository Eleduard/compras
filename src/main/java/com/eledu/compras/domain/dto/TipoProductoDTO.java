package com.eledu.compras.domain.dto;

import com.eledu.compras.domain.entities.Base;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TipoProductoDTO extends Base {

    private String nombreProducto;
    private long categoriaId;

}
