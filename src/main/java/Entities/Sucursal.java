package Entities;

import java.time.LocalTime;
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

public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private Empresa empresa;

    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Categoria> categorias = new HashSet<>();
    public void agregarCategorias(Categoria categoria){
        categorias.add(categoria);
    }
}
