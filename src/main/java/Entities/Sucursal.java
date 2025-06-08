package Entities;

import java.time.LocalTime;
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

public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private Empresa empresa;


    private Set<Promocion> promociones = new HashSet<>();
    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Categoria> categorias = new HashSet<>();
    public void agregarCategorias(Categoria c){
        categorias.add(c);
    }
    public void agregarPromociones(Promocion p){
        promociones.add(p);
    }
    public void agregarPedidos(Pedido p){
        pedidos.add(p);
    }
}
