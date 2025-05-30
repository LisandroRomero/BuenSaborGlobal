package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pais extends Base{
    private String nombre;
    private Set<Provincia> provincias = new HashSet<>();
    public void agregarProvincia (Provincia provincia){
        provincias.add(provincia);
    }


}
