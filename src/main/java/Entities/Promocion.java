package Entities;

import Enums.TipoPromocion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Promocion {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDelDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Imagen> imagenes = new HashSet<>();

    public void agregarImagenes(Imagen imagen){
        imagenes.add(imagen);
    }
}
