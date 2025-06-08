package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.awt.geom.Area;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder//REVISAR UML Y TERMINAR !!!!!!!!!!

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(denominacion, categoria.denominacion) && Objects.equals(categoriaPadre, categoria.categoriaPadre) && Objects.equals(sucursalPadre, categoria.sucursalPadre) && Objects.equals(subcategorias, categoria.subcategorias) && Objects.equals(articulo, categoria.articulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), denominacion, categoriaPadre, sucursalPadre, subcategorias, articulo);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", categoriaPadre=" + categoriaPadre +
                ", sucursalPadre=" + sucursalPadre +
                ", subcategorias=" + subcategorias +
                ", articulo=" + articulo +
                '}';
    }
}
