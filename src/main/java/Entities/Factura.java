package Entities;

import Enums.FormaPago;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode


public class Factura extends Base {
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId; //solo cambio error tipografico con el UML
    private String mpPreferenceId;
    private String mpPaymentType;
    private Double totalVenta;
    private FormaPago formaPago;
    private Pedido pedido;

}
