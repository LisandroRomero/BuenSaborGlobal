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

public class Domicilio extends Base{
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad ;
    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Cliente> clientes = new HashSet<>();

    public Domicilio(String calle, Integer numero, Integer cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void agregarPedido(Pedido p){
        pedidos.add(p);
    }


}
