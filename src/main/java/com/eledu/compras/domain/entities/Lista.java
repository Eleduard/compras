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
public class Lista extends Base {

    private LocalDate fecha;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "lista_id")
    @JsonManagedReference
    @Builder.Default
    private Set<DetalleLista> itemsLista = new HashSet<>();

}