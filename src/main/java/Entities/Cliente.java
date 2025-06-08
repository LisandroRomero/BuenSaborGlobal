package Entities;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Imagen imagen;
    private Usuario usuario;
    private Set<Domicilio> domicilios;
    private Set<Pedido> pedidos = new HashSet<>();

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void agregarDomicilio(Domicilio d){

        domicilios.add(d);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido) && Objects.equals(telefono, cliente.telefono) && Objects.equals(email, cliente.email) && Objects.equals(fechaNacimiento, cliente.fechaNacimiento) && Objects.equals(imagen, cliente.imagen) && Objects.equals(usuario, cliente.usuario) && Objects.equals(domicilios, cliente.domicilios) && Objects.equals(pedidos, cliente.pedidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, apellido, telefono, email, fechaNacimiento, imagen, usuario, domicilios, pedidos);
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", imagen=" + imagen +
                ", usuario=" + usuario +
                ", domicilios=" + domicilios +
                ", pedidos=" + pedidos +
                '}';
    }
}
