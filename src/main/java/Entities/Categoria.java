package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.awt.geom.Area;
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

public class Categoria extends Base{
    private String denominacion;
    private Categoria categoriaPadre;

    private Set<Sucursal> sucursalPadre = new HashSet<>();
    private Set<Categoria> subcategorias = new HashSet<>();
    private Set<Articulo> articulo = new HashSet<>();
    public void agregarSubcategoria(Categoria categoria){
        subcategorias.add(categoria);
    }
    public void agregarSucursal(Sucursal s){

        sucursalPadre.add(s);
    }
    public void agregarArticulo(Articulo a){

        articulo.add(a);
    }
}
