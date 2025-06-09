package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Provincia extends Base{
    private String nombre;
    private Pais pais;

    @Builder.Default
    private Set<Localidad> localidades = new HashSet<>();
    public void agregarLocalidad(Localidad localidad){
        localidades.add(localidad);
    }
}
