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

public class Localidad extends Base{
    private String nombre;
    private Provincia provincia;
    private Set<Domicilio> domicilios = new HashSet<>();
    public void agregarDomicilio (Domicilio domicilio){
        domicilios.add(domicilio);
    }

}
