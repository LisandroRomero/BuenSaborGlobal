package Entities;

import java.util.HashSet;
import java.util.Set;

import lombok.*;
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

    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public void agregarDetalleArticuloManufacturado(ArticuloManufacturadoDetalle a) {
        articuloManufacturadoDetalles.add(a);
    }
}
