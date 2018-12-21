/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

/**
 *
 * @author User
 */
public class EnvaseProducto {
    private Long id_envase;
    private String nombreEnvase;
    private String estado;

    public EnvaseProducto() {
    }

    public EnvaseProducto(Long id_envase, String nombreEnvase) {
        this.id_envase = id_envase;
        this.nombreEnvase = nombreEnvase;
    }

    public EnvaseProducto(Long id_envase, String nombreEnvase, String estado) {
        this.id_envase = id_envase;
        this.nombreEnvase = nombreEnvase;
        this.estado = estado;
    }
    
    

    public Long getId_envase() {
        return id_envase;
    }

    public void setId_envase(Long id_envase) {
        this.id_envase = id_envase;
    }

    public String getNombreEnvase() {
        return nombreEnvase;
    }

    public void setNombreEnvase(String nombreEnvase) {
        this.nombreEnvase = nombreEnvase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
