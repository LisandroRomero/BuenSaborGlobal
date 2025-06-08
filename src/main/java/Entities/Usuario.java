package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Usuario extends Base{
    private String auth0Id;
    private String username;
    private Cliente cliente;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(auth0Id, usuario.auth0Id) && Objects.equals(username, usuario.username) && Objects.equals(cliente, usuario.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), auth0Id, username, cliente);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "auth0Id='" + auth0Id + '\'' +
                ", username='" + username + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
