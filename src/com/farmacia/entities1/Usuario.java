

package com.farmacia.entities1;

import java.io.Serializable;

public class Usuario implements Serializable{
    private int id;
    private int estado;
    private String username;
    private String password;
    private int perfilId;
    private String perfil;    


    public Usuario() {
    }

    public Usuario(int id, int estado, String username, String password, int perfilId, String perfil) {
        this.id = id;
        this.estado = estado;
        this.username = username;
        this.password = password;
        this.perfilId = perfilId;
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(int perfilId) {
        this.perfilId = perfilId;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
