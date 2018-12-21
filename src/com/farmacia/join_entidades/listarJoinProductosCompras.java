/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.join_entidades;

import java.sql.Date;

/**
 *
 * @author User
 */
public class listarJoinProductosCompras {
     private Long id_productos;
    private String nombreProductos;
    private String descripcion;
    private Date fecha_registro;
    private Double peso;
    private Long id_tipo;
    private String nombreTipo;
    private Long id_medida;
    private String nombreMedida;
    private Long id_envase;
    private String nombreEnvase;
    private Long id_marca;
    private String nombreMarca;
    private Long id_usuario;
    private String iva;
    private Long cantidad_minima;
    
    public listarJoinProductosCompras() {
    }

    public listarJoinProductosCompras(Long id_productos, String nombreProductos, String descripcion, Date fecha_registro, Double peso, Long id_tipo, String nombreTipo, Long id_medida, String nombreMedida, Long id_envase, String nombreEnvase, Long id_marca, String nombreMarca, Long id_usuario, String iva, Long cantidad_minima) {
        this.id_productos = id_productos;
        this.nombreProductos = nombreProductos;
        this.descripcion = descripcion;
        this.fecha_registro = fecha_registro;
        this.peso = peso;
        this.id_tipo = id_tipo;
        this.nombreTipo = nombreTipo;
        this.id_medida = id_medida;
        this.nombreMedida = nombreMedida;
        this.id_envase = id_envase;
        this.nombreEnvase = nombreEnvase;
        this.id_marca = id_marca;
        this.nombreMarca = nombreMarca;
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

    public String getNombreProductos() {
        return nombreProductos;
    }

    public void setNombreProductos(String nombreProductos) {
        this.nombreProductos = nombreProductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Long getId_medida() {
        return id_medida;
    }

    public void setId_medida(Long id_medida) {
        this.id_medida = id_medida;
    }

    public String getNombreMedida() {
        return nombreMedida;
    }

    public void setNombreMedida(String nombreMedida) {
        this.nombreMedida = nombreMedida;
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

    public Long getId_marca() {
        return id_marca;
    }

    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
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
