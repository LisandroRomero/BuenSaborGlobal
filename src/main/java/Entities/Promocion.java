package Entities;

import Enums.TipoPromocion;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode

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
}
