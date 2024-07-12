package com.ForoAlura.ForoAlura.domain.domain.respuesta.validaciones.actualizar;

import com.gep.foro_alura.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}
