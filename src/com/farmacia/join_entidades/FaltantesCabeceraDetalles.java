/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.join_entidades;

/**
 *
 * @author josel
 */
import java.sql.Date;

public class FaltantesCabeceraDetalles {

    private Long id_detalle_faltantes;
    private Date fecha_registro;
    private Integer cantidad;
    private String estado;
    private Long id_marcas;
    private String marca;
    private Long id_productos;
    private String nombre;
    private String descripcion;

    public FaltantesCabeceraDetalles() {
    }

    public FaltantesCabeceraDetalles(Long id_detalle_faltantes, Date fecha_registro, Integer cantidad, String estado, Long id_marcas, String marca, Long id_productos, String nombre, String descripcion) {
        this.id_detalle_faltantes = id_detalle_faltantes;
        this.fecha_registro = fecha_registro;
        this.cantidad = cantidad;
        this.estado = estado;
        this.id_marcas = id_marcas;
        this.marca = marca;
        this.id_productos = id_productos;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getId_detalle_faltantes() {
        return id_detalle_faltantes;
    }

    public void setId_detalle_faltantes(Long id_detalle_faltantes) {
        this.id_detalle_faltantes = id_detalle_faltantes;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId_marcas() {
        return id_marcas;
    }

    public void setId_marcas(Long id_marcas) {
        this.id_marcas = id_marcas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getId_productos() {
        return id_productos;
    }

    public void setId_productos(Long id_productos) {
        this.id_productos = id_productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
