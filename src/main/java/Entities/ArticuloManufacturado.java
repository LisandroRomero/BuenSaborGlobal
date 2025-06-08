package Entities;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;

    public ArticuloManufacturado(String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public void agregarDetalleArticuloManufacturado(ArticuloManufacturadoDetalle a) {
        articuloManufacturadoDetalles.add(a);
    }
}
