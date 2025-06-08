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

public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle a){
        articuloManufacturadoDetalles.add(a);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArticuloInsumo that = (ArticuloInsumo) o;
        return Objects.equals(precioCompra, that.precioCompra) && Objects.equals(stockActual, that.stockActual) && Objects.equals(stockMaximo, that.stockMaximo) && Objects.equals(esParaElaborar, that.esParaElaborar) && Objects.equals(articuloManufacturadoDetalles, that.articuloManufacturadoDetalles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), precioCompra, stockActual, stockMaximo, esParaElaborar, articuloManufacturadoDetalles);
    }

    @Override
    public String toString() {
        return "ArticuloInsumo{" +
                "precioCompra=" + precioCompra +
                ", stockActual=" + stockActual +
                ", stockMaximo=" + stockMaximo +
                ", esParaElaborar=" + esParaElaborar +
                ", articuloManufacturadoDetalles=" + articuloManufacturadoDetalles +
                ", denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", Detallespedido=" + Detallespedido +
                ", unidadMedida=" + unidadMedida +
                ", categoria=" + categoria +
                '}';
    }
}
