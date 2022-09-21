/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.development.exception;

/**
 *
 * @author ODIN
 */
public class InternalServerError extends Exception {

    public InternalServerError() {
        super();
    }

    public InternalServerError(String message) {
        super(message);
    }

}
