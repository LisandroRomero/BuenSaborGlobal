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

public class Pais extends Base{
    private String nombre;
    private Set<Provincia> provincias = new HashSet<>();
    public void agregarProvincia (Provincia provincia){
        provincias.add(provincia);
    }
}
