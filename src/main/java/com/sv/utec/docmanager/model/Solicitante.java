package com.sv.utec.docmanager.model;

import java.io.Serializable;
import java.util.Date;

public class Solicitante implements Serializable {
    private Integer id;
    private String nombre;
    private String fecha_nacimiento;
    private String numero_identificacion;
    private String sexo;

    public Solicitante() {
    }

    public Solicitante(Integer id, String nombre, String fecha_nacimiento, String numero_identificacion, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.numero_identificacion = numero_identificacion;
        this.sexo = sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
