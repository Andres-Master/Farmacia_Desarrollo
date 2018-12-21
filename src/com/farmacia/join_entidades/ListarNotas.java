
package com.farmacia.join_entidades;

import java.sql.Date;
import java.sql.Time;


public class ListarNotas {
    private Long id_cabecera_nota_pedidos;
    private String numero_nota;
    private Long id_proveedor;
    private String nombre;
    private String representante;
    private Date fecha_creacion;
    private String estado;
    private Time hora;

    public ListarNotas() {
    }

    public ListarNotas(Long id_cabecera_nota_pedidos, String numero_nota, Long id_proveedor, String nombre, String representante, Date fecha_creacion, String estado, Time hora) {
        this.id_cabecera_nota_pedidos = id_cabecera_nota_pedidos;
        this.numero_nota = numero_nota;
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.representante = representante;
        this.fecha_creacion = fecha_creacion;
        this.estado = estado;
        this.hora = hora;
    }

    public Long getId_cabecera_nota_pedidos() {
        return id_cabecera_nota_pedidos;
    }

    public void setId_cabecera_nota_pedidos(Long id_cabecera_nota_pedidos) {
        this.id_cabecera_nota_pedidos = id_cabecera_nota_pedidos;
    }

    public String getNumero_nota() {
        return numero_nota;
    }

    public void setNumero_nota(String numero_nota) {
        this.numero_nota = numero_nota;
    }

    public Long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
}
