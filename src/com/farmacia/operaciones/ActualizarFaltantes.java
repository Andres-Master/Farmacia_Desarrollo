/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.operaciones;

import java.sql.Date;

/**
 *
 * @author alumno
 */
public class ActualizarFaltantes {
    private Long id_producto;
    private Date fecha_registro;
    private Integer cantidad;
    private String estado_mod;

    public ActualizarFaltantes() {
    }

    public ActualizarFaltantes(Long id_producto, Date fecha_registro, Integer cantidad, String estado_mod) {
        this.id_producto = id_producto;
        this.fecha_registro = fecha_registro;
        this.cantidad = cantidad;
        this.estado_mod = estado_mod;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado_mod() {
        return estado_mod;
    }

    public void setEstado_mod(String estado_mod) {
        this.estado_mod = estado_mod;
    }

   

    
}
