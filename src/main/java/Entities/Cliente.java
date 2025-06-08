package Entities;

import java.time.LocalDate;
import java.util.Set;
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

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Usuario usuario, Imagen imagen)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.imagen = imagen;
    }

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void agregarDomicilio(Domicilio d) {
        domicilios.add(d);
    }
}
