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
public class Laboratorio {
    private Long id_Laboratorio;
    private String RUC;
    private String nombre;
    private String direccion;
    private String telefono;
    private Date fecha;
    private String imagen;
    private String correo;

    public Laboratorio() {
    }

    public Laboratorio(String RUC, String nombre, String direccion, String telefono, Date fecha, String imagen, String correo) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha = fecha;
        this.imagen = imagen;
        this.correo = correo;
    }

    public Laboratorio(Long id_Laboratorio, String RUC, String nombre, String direccion, String telefono, Date fecha, String imagen, String correo) {
        this.id_Laboratorio = id_Laboratorio;
        this.RUC = RUC;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha = fecha;
        this.imagen = imagen;
        this.correo = correo;
    }

    public Long getId_Laboratorio() {
        return id_Laboratorio;
    }

    public void setId_Laboratorio(Long id_Laboratorio) {
        this.id_Laboratorio = id_Laboratorio;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
