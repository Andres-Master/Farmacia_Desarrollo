/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

import java.sql.Date;

/**
 *
 * @author josel
 */
public class cabecera_Faltantes {
    private Long id_cabecera_faltantes;
    private Long numero_lista;
    private Date fecha_registro;
    private String estado;

    public cabecera_Faltantes() {
    }
    
    
    public cabecera_Faltantes(Long id_cabecera_faltantes, Long numero_lista, Date fecha_registro, String estado) {
        this.id_cabecera_faltantes = id_cabecera_faltantes;
        this.numero_lista = numero_lista;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
    }

    public Long getId_cabecera_faltantes() {
        return id_cabecera_faltantes;
    }

    public void setId_cabecera_faltantes(Long id_cabecera_faltantes) {
        this.id_cabecera_faltantes = id_cabecera_faltantes;
    }

    public Long getNumero_lista() {
        return numero_lista;
    }

    public void setNumero_lista(Long numero_lista) {
        this.numero_lista = numero_lista;
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
    
    
}
