package Entities;

import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    private Domicilio domicilio;
    private Sucursal sucursal;
    private Factura factura;
    private Cliente cliente;

    @Builder.Default
    private Set<DetallePedido> detallePedidos = new HashSet<>();
    public void agregarDetallePedido(DetallePedido detallePedido){
        detallePedidos.add(detallePedido);
    }
}
