package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario extends Base{
    private String auth0Id;
    private String username;
    private Cliente cliente;


    public Usuario(String auth0Id, String username) {
        this.auth0Id = auth0Id;
        this.username = username;
    }
}
