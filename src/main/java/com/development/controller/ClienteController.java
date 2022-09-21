package com.development.controller;

import com.development.exception.BadRequest;
import com.development.exception.NotFound;
import com.development.model.ClienteModel;
import org.springframework.stereotype.Service;

@Service
public class ClienteController extends ClienteModel implements IClienteController {

    @Override
    public ClienteModel consultarTipoCedula(String tipo, String cedula) {

        ClienteModel clienteModel = null;

        if (cedula == null || cedula.isEmpty()) {
            throw new BadRequest("Número cédula inválido.");
        } else if (!cedula.equalsIgnoreCase("23445322")) {
            throw new NotFound("Número cédula " + cedula + " no existe.");
        } else if (tipo == null || tipo.isEmpty()) {
            throw new BadRequest("Tipo cédula inválido.");
        } else if (tipo.equalsIgnoreCase("P")) {
            throw new NotFound("Tipo cédula '" + tipo + "' no está asociado al número cédula " + cedula + ".");
        } else if (tipo.equalsIgnoreCase("C") && cedula.equalsIgnoreCase("23445322")) {
            clienteModel = new ClienteModel();
            clienteModel.setPrimerNombre("Jhon");
            clienteModel.setSegundoNombre("Edison");
            clienteModel.setPrimerApellido("Riaño");
            clienteModel.setSegundoApellido("Salazar");
            clienteModel.setTelefono(3147797980L);
            clienteModel.setDireccion("Carrera 1F #52A-47");
            clienteModel.setCiudadResidencia("Cali");
        }

        return clienteModel;

    }

}