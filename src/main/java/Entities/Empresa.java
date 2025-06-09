package Entities;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuil;

    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();
    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }


}
