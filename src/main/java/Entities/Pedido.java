package Entities;

import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
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

    private Set<DetallePedido> detallePedidos = new HashSet<>();
    public void agregarDetallePedido(DetallePedido detallePedido){
        detallePedidos.add(detallePedido);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pedido pedido = (Pedido) o;
        return Double.compare(total, pedido.total) == 0 && Double.compare(totalCosto, pedido.totalCosto) == 0 && Objects.equals(horaEstimadaFinalizacion, pedido.horaEstimadaFinalizacion) && estado == pedido.estado && tipoEnvio == pedido.tipoEnvio && formaPago == pedido.formaPago && Objects.equals(fechaPedido, pedido.fechaPedido) && Objects.equals(domicilio, pedido.domicilio) && Objects.equals(sucursal, pedido.sucursal) && Objects.equals(factura, pedido.factura) && Objects.equals(cliente, pedido.cliente) && Objects.equals(detallePedidos, pedido.detallePedidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horaEstimadaFinalizacion, total, totalCosto, estado, tipoEnvio, formaPago, fechaPedido, domicilio, sucursal, factura, cliente, detallePedidos);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", estado=" + estado +
                ", tipoEnvio=" + tipoEnvio +
                ", formaPago=" + formaPago +
                ", fechaPedido=" + fechaPedido +
                ", domicilio=" + domicilio +
                ", sucursal=" + sucursal +
                ", factura=" + factura +
                ", cliente=" + cliente +
                ", detallePedidos=" + detallePedidos +
                '}';
    }
}
