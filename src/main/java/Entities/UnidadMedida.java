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
public class UnidadMedida extends Base{
    private String denominacion;
    private Set<Articulo> articulos = new HashSet<>();

    public void agregarArticulos(Articulo articulo){
        articulos.add(articulo);
    }
}
