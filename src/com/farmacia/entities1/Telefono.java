
package com.farmacia.entities1;

import java.util.logging.Logger;

public class Telefono {
    private Long id_telefono;
    private Long id_proveedor;
    private int id_tipo_telefono;
    private String telefono;
    private String tipoTelefono;
    private String cedula_ruc;
    
    

    public Telefono() {
    }

    public Telefono(Long id_telefono, Long id_proveedor, int id_tipo_telefono, String telefono, String tipoTelefono, String cedula_ruc) {
        this.id_telefono = id_telefono;
        this.id_proveedor = id_proveedor;
        this.id_tipo_telefono = id_tipo_telefono;
        this.telefono = telefono;
        this.tipoTelefono = tipoTelefono;
        this.cedula_ruc = cedula_ruc;
    }

    public Long getId_telefono() {
        return id_telefono;
    }

    public void setId_telefono(Long id_telefono) {
        this.id_telefono = id_telefono;
    }

    public Long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_tipo_telefono() {
        return id_tipo_telefono;
    }

    public void setId_tipo_telefono(int id_tipo_telefono) {
        this.id_tipo_telefono = id_tipo_telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public String getCedula_ruc() {
        return cedula_ruc;
    }

    public void setCedula_ruc(String cedula_ruc) {
        this.cedula_ruc = cedula_ruc;
    }

    
}
