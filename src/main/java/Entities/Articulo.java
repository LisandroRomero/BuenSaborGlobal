package Entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode

public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;

    private Set<Imagen> imagen = new HashSet<>();
    private Set<Promocion> promocion = new HashSet<>();
    protected Set<DetallePedido> Detallespedido = new HashSet<>();

    protected UnidadMedida unidadMedida;
    protected Categoria categoria;

    public void agregarImagen(Imagen i){
        imagen.add(i);
    }
    public void agregarPromocion(Promocion p){
        promocion.add(p);
    }
    public void agregarDetallePedido(DetallePedido d){
        Detallespedido.add(d);
    }

   
}
