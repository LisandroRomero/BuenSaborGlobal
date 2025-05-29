package Entities;

import Entities.Base;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Imagen extends Base {
    private String denominacion;
    private Cliente cliente;
}
