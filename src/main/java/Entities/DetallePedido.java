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

public class DetallePedido extends Base {
    private Integer cantidad;
    private double subTotal;
    private Articulo articulo;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DetallePedido that = (DetallePedido) o;
        return Double.compare(subTotal, that.subTotal) == 0 && Objects.equals(cantidad, that.cantidad) && Objects.equals(articulo, that.articulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cantidad, subTotal, articulo);
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", articulo=" + articulo +
                '}';
    }
}
