package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.geom.Area;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor              //REVISAR UML Y TERMINAR !!!!!!!!!!

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
