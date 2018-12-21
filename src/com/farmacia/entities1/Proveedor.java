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
public class Proveedor {
    private int id;
    private String ruc;
    private String nombre;
    private String representante;
    private String direccion;
    private int id_proveedor_clase;
    private int id_telefonos;
    private int id_correos;
    private String telefono;
    private String correo;

    public Proveedor() {
    }

    public Proveedor(int id, String ruc, String nombre, String representante, String direccion, int id_proveedor_clase, int id_telefonos, int id_correos, String telefono, String correo) {
        this.id = id;
        this.ruc = ruc;
        this.nombre = nombre;
        this.representante = representante;
        this.direccion = direccion;
        this.id_proveedor_clase = id_proveedor_clase;
        this.id_telefonos = id_telefonos;
        this.id_correos = id_correos;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getId_proveedor_clase() {
        return id_proveedor_clase;
    }

    public void setId_proveedor_clase(int id_proveedor_clase) {
        this.id_proveedor_clase = id_proveedor_clase;
    }

    public int getId_telefonos() {
        return id_telefonos;
    }

    public void setId_telefonos(int id_telefonos) {
        this.id_telefonos = id_telefonos;
    }

    public int getId_correos() {
        return id_correos;
    }

    public void setId_correos(int id_correos) {
        this.id_correos = id_correos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
