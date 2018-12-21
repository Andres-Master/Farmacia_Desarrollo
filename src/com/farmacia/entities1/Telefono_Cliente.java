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
public class Telefono_Cliente {
    private Long id_Telefono;
    private Long id_tipo_Telefono;
    private String numero;
    private String cedula;

    public Telefono_Cliente() {
    }

    public Telefono_Cliente(Long id_Telefono, Long id_tipo_Telefono, String numero, String cedula) {
        this.id_Telefono = id_Telefono;
        this.id_tipo_Telefono = id_tipo_Telefono;
        this.numero = numero;
        this.cedula = cedula;
    }

    public Telefono_Cliente(Long id_tipo_Telefono, String numero, String cedula) {
        this.id_tipo_Telefono = id_tipo_Telefono;
        this.numero = numero;
        this.cedula = cedula;
    }

    public Long getId_Telefono() {
        return id_Telefono;
    }

    public void setId_Telefono(Long id_Telefono) {
        this.id_Telefono = id_Telefono;
    }

    public Long getId_tipo_Telefono() {
        return id_tipo_Telefono;
    }

    public void setId_tipo_Telefono(Long id_tipo_Telefono) {
        this.id_tipo_Telefono = id_tipo_Telefono;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    

    
   
}
