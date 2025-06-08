package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode

public class Usuario extends Base{
    private String auth0Id;
    private String username;
    private Cliente cliente;
}
