/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

/**
 *
 * @author ANGEL JESUS
 */
public class Direccion {
    private Long id_direccion;
    private String cedula_ruc;
    private String direccion;
    private int id_tipod;

    public Direccion() {
    }

    public Direccion(Long id_direccion, String cedula_ruc, String direccion, int id_tipod) {
        this.id_direccion = id_direccion;
        this.cedula_ruc = cedula_ruc;
        this.direccion = direccion;
        this.id_tipod = id_tipod;
    }
    

    public Long getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCedula_ruc() {
        return cedula_ruc;
    }

    public void setCedula_ruc(String cedula_ruc) {
        this.cedula_ruc = cedula_ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId_tipod() {
        return id_tipod;
    }

    public void setId_tipod(int id_tipod) {
        this.id_tipod = id_tipod;
    }

    
}
