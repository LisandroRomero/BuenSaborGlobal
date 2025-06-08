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

public class Pais extends Base{
    private String nombre;
    private Set<Provincia> provincias = new HashSet<>();
    public void agregarProvincia (Provincia provincia){
        provincias.add(provincia);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre) && Objects.equals(provincias, pais.provincias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, provincias);
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", provincias=" + provincias +
                '}';
    }
}
