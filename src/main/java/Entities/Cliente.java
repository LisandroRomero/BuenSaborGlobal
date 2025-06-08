package Entities;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
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
}
