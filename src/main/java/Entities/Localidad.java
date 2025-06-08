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
public class Localidad extends Base{
    private String nombre;
    private Provincia provincia;
    private Set<Domicilio> domicilios = new HashSet<>();
    public void agregarDomicilio (Domicilio domicilio){
        domicilios.add(domicilio);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Localidad localidad = (Localidad) o;
        return Objects.equals(nombre, localidad.nombre) && Objects.equals(provincia, localidad.provincia) && Objects.equals(domicilios, localidad.domicilios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, provincia, domicilios);
    }


    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                ", provincia=" + provincia +
                ", domicilios=" + domicilios +
                '}';
    }
}
