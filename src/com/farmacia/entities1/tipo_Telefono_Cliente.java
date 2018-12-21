/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

/**
 *
 * @author guest-alrdks
 */
public class tipo_Telefono_Cliente {
    private Long id_Tipo_Telefono;
    private String tipo;

    public tipo_Telefono_Cliente() {
    }

    public tipo_Telefono_Cliente(Long id_Tipo_Telefono, String tipo) {
        this.id_Tipo_Telefono = id_Tipo_Telefono;
        this.tipo = tipo;
    }

    public tipo_Telefono_Cliente(String tipo) {
        this.tipo = tipo;
    }

    public Long getId_Tipo_Telefono() {
        return id_Tipo_Telefono;
    }

    public void setId_Tipo_Telefono(Long id_Tipo_Telefono) {
        this.id_Tipo_Telefono = id_Tipo_Telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    
}
