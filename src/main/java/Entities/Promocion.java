package Entities;

import Enums.TipoPromocion;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Promocion {
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    private Set<Imagen> imagenes = new HashSet<>();
    private Set<Articulo> articulo = new HashSet<>();

    public void agregarImagenes(Imagen imagen){
        imagenes.add(imagen);
    }
    public void agregarArticulo(Articulo a){
        articulo.add(a);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Promocion promocion = (Promocion) o;
        return Objects.equals(denominacion, promocion.denominacion) && Objects.equals(FechaDesde, promocion.FechaDesde) && Objects.equals(FechaHasta, promocion.FechaHasta) && Objects.equals(HoraDesde, promocion.HoraDesde) && Objects.equals(HoraHasta, promocion.HoraHasta) && Objects.equals(descripcionDescuento, promocion.descripcionDescuento) && Objects.equals(precioPromocional, promocion.precioPromocional) && tipoPromocion == promocion.tipoPromocion && Objects.equals(imagenes, promocion.imagenes) && Objects.equals(articulo, promocion.articulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominacion, FechaDesde, FechaHasta, HoraDesde, HoraHasta, descripcionDescuento, precioPromocional, tipoPromocion, imagenes, articulo);
    }

    @Override
    public String toString() {
        return "Promocion{" +
                "denominacion='" + denominacion + '\'' +
                ", FechaDesde=" + FechaDesde +
                ", FechaHasta=" + FechaHasta +
                ", HoraDesde=" + HoraDesde +
                ", HoraHasta=" + HoraHasta +
                ", descripcionDescuento='" + descripcionDescuento + '\'' +
                ", precioPromocional=" + precioPromocional +
                ", tipoPromocion=" + tipoPromocion +
                ", imagenes=" + imagenes +
                ", articulo=" + articulo +
                '}';
    }
}
