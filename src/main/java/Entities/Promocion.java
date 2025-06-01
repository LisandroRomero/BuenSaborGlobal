package Entities;

import Enums.TipoPromocion;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Promocion {
    private String denominacion;
    private LocalTime FechaDesde;
    private LocalTime FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;

    private Set<Imagen> imagen = new HashSet<>();
    private Set<Articulo> articulo = new HashSet<>();
}
