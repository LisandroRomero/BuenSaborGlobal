package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Domicilio domicilio = (Domicilio) o;
        return Objects.equals(calle, domicilio.calle) && Objects.equals(numero, domicilio.numero) && Objects.equals(cp, domicilio.cp) && Objects.equals(localidad, domicilio.localidad) && Objects.equals(pedidos, domicilio.pedidos) && Objects.equals(clientes, domicilio.clientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), calle, numero, cp, localidad, pedidos, clientes);
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", cp=" + cp +
                ", localidad=" + localidad +
                ", pedidos=" + pedidos +
                ", clientes=" + clientes +
                '}';
    }
}
