package com.eledu.compras.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Compra extends Base {

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "comercio")
    private Comercio comercio;

    /*
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "compra_producto",
            joinColumns = @JoinColumn(name = "compra_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    @Builder.Default
    private Set<Producto> productos = new HashSet<>();
     */

}
