package com.ForoAlura.ForoAlura.domain.domain.usuario;

public record ActualizarUsuarioDTO(
   String password,
   Role role,
   String nombre,
   String apellido,
   String email,
   Boolean enabled

) {
}


