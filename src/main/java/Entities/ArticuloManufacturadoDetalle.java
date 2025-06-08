package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;  //REVISARRRRR!!!!!!!!
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class ArticuloManufacturadoDetalle {
    private Integer cantidad;
    private ArticuloManufacturado articuloManufacturado;
    private ArticuloInsumo  articuloInsumo;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ArticuloManufacturadoDetalle that = (ArticuloManufacturadoDetalle) o;
        return Objects.equals(cantidad, that.cantidad) && Objects.equals(articuloManufacturado, that.articuloManufacturado) && Objects.equals(articuloInsumo, that.articuloInsumo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad, articuloManufacturado, articuloInsumo);
    }

    @Override
    public String toString() {
        return "ArticuloManufacturadoDetalle{" +
                "cantidad=" + cantidad +
                ", articuloManufacturado=" + articuloManufacturado +
                ", articuloInsumo=" + articuloInsumo +
                '}';
    }
}
