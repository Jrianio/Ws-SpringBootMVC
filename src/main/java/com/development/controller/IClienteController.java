package com.development.controller;

import com.development.model.ClienteModel;

public interface IClienteController {

    public ClienteModel consultarTipoCedula(String tipo, String cedula);

}
