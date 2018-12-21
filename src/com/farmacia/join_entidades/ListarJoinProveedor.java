/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.join_entidades;

import java.sql.Date;

/**
 *
 * @author ineval
 */
public class ListarJoinProveedor {

    private Long id_proveedor;
    private Long id_proveedor_clase;
    private String clase;
    private String cedula_ruc;
    private String entidad;
    private String representante;
    private String direccion;
    private Date fecha_registro;
    private String estado;
    private Long id_tipo_telefono;
    private String telefono;
    private String tipo_telefon;
    private Long id_tipo_correo;
    private String mail;
    private String tipo_correo;

    public ListarJoinProveedor() {
    }

    public ListarJoinProveedor(Long id_proveedor, Long id_proveedor_clase, String clase, String cedula_ruc, String entidad, String representante, String direccion, Date fecha_registro, String estado, Long id_tipo_telefono, String telefono, String tipo_telefon, Long id_tipo_correo, String mail, String tipo_correo) {
        this.id_proveedor = id_proveedor;
        this.id_proveedor_clase = id_proveedor_clase;
        this.clase = clase;
        this.cedula_ruc = cedula_ruc;
        this.entidad = entidad;
        this.representante = representante;
        this.direccion = direccion;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
        this.id_tipo_telefono = id_tipo_telefono;
        this.telefono = telefono;
        this.tipo_telefon = tipo_telefon;
        this.id_tipo_correo = id_tipo_correo;
        this.mail = mail;
        this.tipo_correo = tipo_correo;
    }

    public Long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public Long getId_proveedor_clase() {
        return id_proveedor_clase;
    }

    public void setId_proveedor_clase(Long id_proveedor_clase) {
        this.id_proveedor_clase = id_proveedor_clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getCedula_ruc() {
        return cedula_ruc;
    }

    public void setCedula_ruc(String cedula_ruc) {
        this.cedula_ruc = cedula_ruc;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Long getId_tipo_telefono() {
        return id_tipo_telefono;
    }

    public void setId_tipo_telefono(Long id_tipo_telefono) {
        this.id_tipo_telefono = id_tipo_telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo_telefon() {
        return tipo_telefon;
    }

    public void setTipo_telefon(String tipo_telefon) {
        this.tipo_telefon = tipo_telefon;
    }

    public Long getId_tipo_correo() {
        return id_tipo_correo;
    }

    public void setId_tipo_correo(Long id_tipo_correo) {
        this.id_tipo_correo = id_tipo_correo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTipo_correo() {
        return tipo_correo;
    }

    public void setTipo_correo(String tipo_correo) {
        this.tipo_correo = tipo_correo;
    }

    
}
