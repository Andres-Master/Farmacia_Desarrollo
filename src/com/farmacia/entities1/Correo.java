
package com.farmacia.entities1;

public class Correo  {
    private Long id_correo;
    private Long id_proveedor;
    private int id_tipo_correo;
    private String correo;
    private String tipo_correo;
    private String cedula_ruc;
    

    public Correo() {
    }

    public Correo(Long id_correo, Long id_proveedor, int id_tipo_correo, String correo, String tipo_correo, String cedula_ruc) {
        this.id_correo = id_correo;
        this.id_proveedor = id_proveedor;
        this.id_tipo_correo = id_tipo_correo;
        this.correo = correo;
        this.tipo_correo = tipo_correo;
        this.cedula_ruc = cedula_ruc;
    }

    public Long getId_correo() {
        return id_correo;
    }

    public void setId_correo(Long id_correo) {
        this.id_correo = id_correo;
    }

    public Long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_tipo_correo() {
        return id_tipo_correo;
    }

    public void setId_tipo_correo(int id_tipo_correo) {
        this.id_tipo_correo = id_tipo_correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo_correo() {
        return tipo_correo;
    }

    public void setTipo_correo(String tipo_correo) {
        this.tipo_correo = tipo_correo;
    }

    public String getCedula_ruc() {
        return cedula_ruc;
    }

    public void setCedula_ruc(String cedula_ruc) {
        this.cedula_ruc = cedula_ruc;
    }

    
}
