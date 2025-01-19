package com.eledu.compras.domain.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "promocion")
    private Promocion promocion;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "compra_id")
    @JsonManagedReference
    private Set<DetalleCompra> itemsCompra = new HashSet<>();

}
