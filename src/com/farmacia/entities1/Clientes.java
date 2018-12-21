/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

import java.sql.Date;

/**
 *
 * @author guest-alrdks
 */
public class Clientes extends Persona {

    public Clientes() {
    }

    public Clientes(Long id_Clientes, String cedula, String nombre, String apellido, String direccion, String estado, Date fecha_reg, String str_telefono, String str_correo) {
        super(id_Clientes, cedula, nombre, apellido, direccion, estado, fecha_reg, str_telefono, str_correo);
    }

   

}
