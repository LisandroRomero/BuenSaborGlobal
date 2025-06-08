package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode

public class UnidadMedida extends Base{
    private String denominacion;
    private Set<Articulo> articulos = new HashSet<>();

    public void agregarArticulos(Articulo articulo){
        articulos.add(articulo);
    }
}
