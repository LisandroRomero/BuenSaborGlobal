package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode

public class ArticuloManufacturadoDetalle {
    private Integer cantidad;
    private ArticuloManufacturado articuloManufacturado;
    private ArticuloInsumo  articuloInsumo;

}
