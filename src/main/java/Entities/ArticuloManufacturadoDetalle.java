package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;  //REVISARRRRR!!!!!!!!
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class ArticuloManufacturadoDetalle extends Base {
    private Integer cantidad;
    private ArticuloManufacturado articuloManufacturado;
    private ArticuloInsumo  articuloInsumo;

}
