package Entities;

import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;

import lombok.*;
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
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();


    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void agregarDomicilio(Domicilio d) {
        domicilios.add(d);
    }
}
