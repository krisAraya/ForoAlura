package com.ForoAlura.ForoAlura.domain.domain.topico;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}
