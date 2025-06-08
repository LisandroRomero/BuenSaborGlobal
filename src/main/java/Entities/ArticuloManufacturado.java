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

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;

    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public void agregarDetalleArticuloManufacturado(ArticuloManufacturadoDetalle a) {
        articuloManufacturadoDetalles.add(a);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArticuloManufacturado that = (ArticuloManufacturado) o;
        return Objects.equals(descripcion, that.descripcion) && Objects.equals(tiempoEstimadoMinutos, that.tiempoEstimadoMinutos) && Objects.equals(preparacion, that.preparacion) && Objects.equals(articuloManufacturadoDetalles, that.articuloManufacturadoDetalles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), descripcion, tiempoEstimadoMinutos, preparacion, articuloManufacturadoDetalles);
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", articuloManufacturadoDetalles=" + articuloManufacturadoDetalles +
                ", denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", Detallespedido=" + Detallespedido +
                ", unidadMedida=" + unidadMedida +
                ", categoria=" + categoria +
                '}';
    }
}
