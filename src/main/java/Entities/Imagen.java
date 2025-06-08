package Entities;

import Entities.Base;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode

public class Imagen extends Base {
    private String denominacion;
    private Promocion promocion;
    private Articulo articulo;
    private Cliente cliente;


}
