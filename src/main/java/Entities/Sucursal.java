package Entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private Empresa empresa;


    private Set<Promocion> promociones = new HashSet<>();
    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Categoria> categorias = new HashSet<>();
    public void agregarCategorias(Categoria c){
        categorias.add(c);
    }
    public void agregarPromociones(Promocion p){
        promociones.add(p);
    }
    public void agregarPedidos(Pedido p){
        pedidos.add(p);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sucursal sucursal = (Sucursal) o;
        return Objects.equals(nombre, sucursal.nombre) && Objects.equals(horarioApertura, sucursal.horarioApertura) && Objects.equals(horarioCierre, sucursal.horarioCierre) && Objects.equals(domicilio, sucursal.domicilio) && Objects.equals(empresa, sucursal.empresa) && Objects.equals(promociones, sucursal.promociones) && Objects.equals(pedidos, sucursal.pedidos) && Objects.equals(categorias, sucursal.categorias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, horarioApertura, horarioCierre, domicilio, empresa, promociones, pedidos, categorias);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", domicilio=" + domicilio +
                ", empresa=" + empresa +
                ", promociones=" + promociones +
                ", pedidos=" + pedidos +
                ", categorias=" + categorias +
                '}';
    }
}
