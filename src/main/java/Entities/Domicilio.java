package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor

public class Domicilio extends Base{
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad ;
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();
    @Builder.Default
    private Set<Cliente> clientes = new HashSet<>();

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void agregarPedido(Pedido p){
        pedidos.add(p);
    }


}
