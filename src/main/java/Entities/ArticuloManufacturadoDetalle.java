package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;  //REVISARRRRR!!!!!!!!
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloManufacturadoDetalle {
    private Integer cantidad;
    private ArticuloManufacturado articuloManufacturado;
    private ArticuloInsumo  articuloInsumo;
}
