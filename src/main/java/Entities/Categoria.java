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

public class Categoria extends Base{
    private String denominacion;
    private Categoria categoriaPadre;

    @Builder.Default
    private Set<Sucursal> sucursalPadre = new HashSet<>();
    @Builder.Default
    private Set<Categoria> subcategorias = new HashSet<>();
    @Builder.Default
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
