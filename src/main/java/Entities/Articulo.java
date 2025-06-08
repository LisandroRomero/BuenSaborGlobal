package Entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;

    private Set<Imagen> imagen = new HashSet<>();
    private Set<Promocion> promocion = new HashSet<>();
    protected Set<DetallePedido> Detallespedido = new HashSet<>();

    protected UnidadMedida unidadMedida;
    protected Categoria categoria;

    public void agregarImagen(Imagen i){
        imagen.add(i);
    }
    public void agregarPromocion(Promocion p){
        promocion.add(p);
    }
    public void agregarDetallePedido(DetallePedido d){
        Detallespedido.add(d);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Objects.equals(denominacion, articulo.denominacion) && Objects.equals(precioVenta, articulo.precioVenta) && Objects.equals(imagen, articulo.imagen) && Objects.equals(promocion, articulo.promocion) && Objects.equals(Detallespedido, articulo.Detallespedido) && Objects.equals(unidadMedida, articulo.unidadMedida) && Objects.equals(categoria, articulo.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominacion, precioVenta, imagen, promocion, Detallespedido, unidadMedida, categoria);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", imagen=" + imagen +
                ", promocion=" + promocion +
                ", Detallespedido=" + Detallespedido +
                ", unidadMedida=" + unidadMedida +
                ", categoria=" + categoria +
                '}';
    }
}
