/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

import java.sql.Date;

public class Productos {

    private Long id_productos;
    private Long id_tipo;
    private Long id_marcas;
    private Long id_medidas;
    private Long id_envase;
    private String nombre;
    private String descripcion;
    private double peso;
    private Date fecha_registro;
    private String estado;
    private Long id_usuario;
    private String iva;
    private Long cantidad_minima;
    

    public Productos() {
    }

    public Productos(Long id_productos, Long id_tipo, Long id_marcas, Long id_medidas, Long id_envase, String nombre, String descripcion, double peso, Date fecha_registro, String estado, Long id_usuario, String iva, Long cantidad_minima) {
        this.id_productos = id_productos;
        this.id_tipo = id_tipo;
        this.id_marcas = id_marcas;
        this.id_medidas = id_medidas;
        this.id_envase = id_envase;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
        this.id_usuario = id_usuario;
        this.iva = iva;
        this.cantidad_minima = cantidad_minima;
    }

    public Long getId_productos() {
        return id_productos;
    }

    public void setId_productos(Long id_productos) {
        this.id_productos = id_productos;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public Long getId_marcas() {
        return id_marcas;
    }

    public void setId_marcas(Long id_marcas) {
        this.id_marcas = id_marcas;
    }

    public Long getId_medidas() {
        return id_medidas;
    }

    public void setId_medidas(Long id_medidas) {
        this.id_medidas = id_medidas;
    }

    public Long getId_envase() {
        return id_envase;
    }

    public void setId_envase(Long id_envase) {
        this.id_envase = id_envase;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public Long getCantidad_minima() {
        return cantidad_minima;
    }

    public void setCantidad_minima(Long cantidad_minima) {
        this.cantidad_minima = cantidad_minima;
    }

    
    
}
