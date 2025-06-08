package Entities;

import Entities.Base;
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

public class Imagen extends Base {
    private String denominacion;
    private Promocion promocion;
    private Articulo articulo;
    private Cliente cliente;


    @Override
    public String toString() {
        return "Imagen{" +
                "denominacion='" + denominacion + '\'' +
                ", promocion=" + promocion +
                ", articulo=" + articulo +
                ", cliente=" + cliente +
                '}';
    }
}
