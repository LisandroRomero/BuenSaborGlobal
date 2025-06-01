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

public class Provincia extends Base{
    private String nombre;
    private Pais pais;
    private Set<Localidad> localidades = new HashSet<>();
    public void agregarLocalidad(Localidad localidad){
        localidades.add(localidad);
    }
}
