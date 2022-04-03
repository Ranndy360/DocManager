package com.sv.utec.docmanager.model;

import java.io.Serializable;

public class Usuarios implements Serializable {

    private Integer id;
    private String correo;
    private String contra;
    private String estado;

    public Usuarios(Integer id, String correo, String contra, String estado) {
        this.id = id;
        this.correo = correo;
        this.contra = contra;
        this.estado = estado;
    }

    public Usuarios() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
