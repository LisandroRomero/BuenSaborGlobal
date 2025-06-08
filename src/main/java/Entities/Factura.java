package Entities;

import Enums.FormaPago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Factura extends Base {
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId; //solo cambio error tipografico con el UML
    private String mpPreferenceId;
    private String mpPaymentType;
    private Double totalVenta;
    private FormaPago formaPago;
    private Pedido pedido;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Factura factura = (Factura) o;
        return Objects.equals(fechaFacturacion, factura.fechaFacturacion) && Objects.equals(mpPaymentId, factura.mpPaymentId) && Objects.equals(mpMerchantOrderId, factura.mpMerchantOrderId) && Objects.equals(mpPreferenceId, factura.mpPreferenceId) && Objects.equals(mpPaymentType, factura.mpPaymentType) && Objects.equals(totalVenta, factura.totalVenta) && formaPago == factura.formaPago && Objects.equals(pedido, factura.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaFacturacion, mpPaymentId, mpMerchantOrderId, mpPreferenceId, mpPaymentType, totalVenta, formaPago, pedido);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "fechaFacturacion=" + fechaFacturacion +
                ", mpPaymentId=" + mpPaymentId +
                ", mpMerchantOrderId=" + mpMerchantOrderId +
                ", mpPreferenceId='" + mpPreferenceId + '\'' +
                ", mpPaymentType='" + mpPaymentType + '\'' +
                ", totalVenta=" + totalVenta +
                ", formaPago=" + formaPago +
                ", pedido=" + pedido +
                '}';
    }
}
