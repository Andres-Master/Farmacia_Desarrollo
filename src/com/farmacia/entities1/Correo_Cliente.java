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
public class Correo_Cliente {
    private Long id_Correo;
    private String correo;
    private String cedula;

    public Correo_Cliente() {
    }

    public Correo_Cliente(Long id_Correo, String correo, String cedula) {
        this.id_Correo = id_Correo;
        this.correo = correo;
        this.cedula = cedula;
    }

    public Correo_Cliente(String correo, String cedula) {
        this.correo = correo;
        this.cedula = cedula;
    }

    public Long getId_Correo() {
        return id_Correo;
    }

    public void setId_Correo(Long id_Correo) {
        this.id_Correo = id_Correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   
}
    
