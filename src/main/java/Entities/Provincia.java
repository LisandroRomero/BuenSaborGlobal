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

public class Provincia extends Base{
    private String nombre;
    private Pais pais;
    private Set<Localidad> localidades = new HashSet<>();
    public void agregarLocalidad(Localidad localidad){
        localidades.add(localidad);
    }
}
