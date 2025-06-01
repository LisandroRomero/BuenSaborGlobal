package Entities;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;

    private Set<Imagen> imagen = new HashSet<>();
    private Set<Promocion> promocion = new HashSet<>();
    private Set<Categoria> categorias = new HashSet<>();



    protected Set<DetallePedido> Detallespedido = new HashSet<>();
    protected UnidadMedida unidadMedida;
    protected Categoria categoria;
}
