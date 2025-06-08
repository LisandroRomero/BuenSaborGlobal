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

public class Provincia extends Base{
    private String nombre;
    private Pais pais;
    private Set<Localidad> localidades = new HashSet<>();
    public void agregarLocalidad(Localidad localidad){
        localidades.add(localidad);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Provincia provincia = (Provincia) o;
        return Objects.equals(nombre, provincia.nombre) && Objects.equals(pais, provincia.pais) && Objects.equals(localidades, provincia.localidades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, pais, localidades);
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", pais=" + pais +
                ", localidades=" + localidades +
                '}';
    }
}
