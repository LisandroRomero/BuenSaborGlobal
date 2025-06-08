package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class UnidadMedida extends Base{
    private String denominacion;
    private Set<Articulo> articulos = new HashSet<>();

    public void agregarArticulos(Articulo articulo){
        articulos.add(articulo);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UnidadMedida that = (UnidadMedida) o;
        return Objects.equals(denominacion, that.denominacion) && Objects.equals(articulos, that.articulos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), denominacion, articulos);
    }

    @Override
    public String toString() {
        return "UnidadMedida{" +
                "denominacion='" + denominacion + '\'' +
                ", articulos=" + articulos +
                '}';
    }
}
