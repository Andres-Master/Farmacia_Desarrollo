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
public class Proveedor_telefono {
    private int id;
    private String telefono;
    private String telefono2;

    public Proveedor_telefono() {
    }

    public Proveedor_telefono(int id, String telefono, String telefono2) {
        this.id = id;
        this.telefono = telefono;
        this.telefono2 = telefono2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    
}
