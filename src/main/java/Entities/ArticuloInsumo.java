package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode

public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle a){
        articuloManufacturadoDetalles.add(a);
    }


}
