package com.sv.utec.docmanager.model;

import java.io.Serializable;

public class Empleados implements Serializable {
    private Integer id;
    private String name;
    private String apellido;
    private String carnet;
    private Integer usuario_Id;
    private Integer area_Id;

    public Empleados() {
    }

    public Empleados(Integer id, String name, String apellido, String carnet, Integer usuario_Id, Integer area_Id) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.carnet = carnet;
        this.usuario_Id = usuario_Id;
        this.area_Id = area_Id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Integer getUsuario_Id() {
        return usuario_Id;
    }

    public void setUsuario_Id(Integer usuario_Id) {
        this.usuario_Id = usuario_Id;
    }

    public Integer getArea_Id() {
        return area_Id;
    }

    public void setArea_Id(Integer area_Id) {
        this.area_Id = area_Id;
    }
}
