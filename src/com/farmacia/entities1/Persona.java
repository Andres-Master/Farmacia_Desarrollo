/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

import java.sql.Date;

/**
 *
 * @author guest-qt2fdj
 */
public class Persona {

    private Long id_Clientes;
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String estado;
    private Date fecha_reg;
    private String str_telefono;
    private String str_correo;

    public Persona() {
    }

    public Persona(Long id_Clientes, String cedula, String nombre, String apellido, String direccion, String estado, Date fecha_reg, String str_telefono, String str_correo) {
        this.id_Clientes = id_Clientes;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.estado = estado;
        this.fecha_reg = fecha_reg;
        this.str_telefono = str_telefono;
        this.str_correo = str_correo;
    }

    public Persona(String cedula, String nombre, String apellido, String direccion, String estado, Date fecha_reg, String str_telefono, String str_correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.estado = estado;
        this.fecha_reg = fecha_reg;
        this.str_telefono = str_telefono;
        this.str_correo = str_correo;
    }

    public Long getId_Clientes() {
        return id_Clientes;
    }

    public void setId_Clientes(Long id_Clientes) {
        this.id_Clientes = id_Clientes;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(Date fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public String getStr_telefono() {
        return str_telefono;
    }

    public void setStr_telefono(String str_telefono) {
        this.str_telefono = str_telefono;
    }

    public String getStr_correo() {
        return str_correo;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }

   
    
}
