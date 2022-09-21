package com.development.view;

import com.development.exception.InternalServerError;
import com.development.controller.IClienteController;
import com.development.model.ClienteModel;
import javax.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Api
@Slf4j // Logs Spring
@RequestMapping("apirest") // Ruta
public class ClienteView {

    @Autowired
    private IClienteController clienteController;

    /**
     *
     * @param tipo
     * @param cedula
     * @return Obj ClienteModel
     */
    @PostMapping("/consultar")
    public ClienteModel consultar(@PathParam("tipo") String tipo, @PathParam("cedula") String cedula) throws InternalServerError {

        log.info("---------- INI: consultar ----------");

        try {

            ClienteModel objResponse = clienteController.consultarTipoCedula(tipo, cedula);

            log.info("tipo: " + tipo);
            log.info("cedula: " + cedula);

            log.info("---------- FIN: consultar ----------");

            return objResponse;

        } catch (Exception ex) {
            throw new InternalServerError("<<< Caused By [" + ex + "] >>>");
        }
    }
}
