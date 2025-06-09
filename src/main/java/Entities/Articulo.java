package Entities;

import java.util.HashSet;
import java.util.Set;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder


public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;
    protected UnidadMedida unidadMedida;
    protected Categoria categoria;

    @Builder.Default
    private Set<Imagen> imagen = new HashSet<>();
    @Builder.Default
    private Set<Promocion> promocion = new HashSet<>();
    @Builder.Default
    protected Set<DetallePedido> Detallespedido = new HashSet<>();


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
