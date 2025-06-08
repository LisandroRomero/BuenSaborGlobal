package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode

public class Domicilio extends Base{
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad ;
    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Cliente> clientes = new HashSet<>();
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void agregarPedido(Pedido p){

        pedidos.add(p);
    }
}
