/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

import java.sql.Date;

/**
 *
 * @author alumno
 */
public class detalle_faltantes {
    
    private Long id_detalle_faltantes;
    private Long id_producto;
    private Date fecha_registro;
    private int cantidad;
    private String estado;

    public detalle_faltantes() {
    }

    public detalle_faltantes(Long id_detalle_faltantes, Long id_producto, Date fecha_registro, int cantidad, String estado) {
        this.id_detalle_faltantes = id_detalle_faltantes;
        this.id_producto = id_producto;
        this.fecha_registro = fecha_registro;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public Long getId_detalle_faltantes() {
        return id_detalle_faltantes;
    }

    public void setId_detalle_faltantes(Long id_detalle_faltantes) {
        this.id_detalle_faltantes = id_detalle_faltantes;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
            
    
}
