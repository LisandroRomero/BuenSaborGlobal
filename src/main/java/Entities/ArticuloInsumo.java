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

public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, Double precioVenta, UnidadMedida unidadMedida, Categoria categoria, Double precioCompra, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar) {
        super(denominacion, precioVenta, unidadMedida, categoria);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle a){
        articuloManufacturadoDetalles.add(a);
    }
}
