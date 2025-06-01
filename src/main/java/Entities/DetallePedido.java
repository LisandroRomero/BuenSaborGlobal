package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DetallePedido extends Base {
    private Integer cantidad;
    private Double subTotal;
    //private Articulo articulo;  //   REVISAR ESTO PORFAVOR YA QUE ARTICULO ES ABSTRACTO!!!!!!!!!
    private Set<Articulo> articulo = new HashSet<>(); //porque (DetallePedido n-1 Articulo)

}
