package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Pais extends Base{
    private String nombre;
    @Builder.Default
    private Set<Provincia> provincias = new HashSet<>();
    public void agregarProvincia (Provincia provincia){
        provincias.add(provincia);
    }

}
