package com.sv.utec.docmanager.model;

import java.io.Serializable;

public class Solicitud implements Serializable {
    private Integer id;
    private String codigo;
    private String fecha_ingreso;
    private String fecha_actualizacion;
    private Integer anterior_area_id;
    private Integer actual_area_id;
    private String estado;
    private Integer solicitante_id;
    private String descripcion;
    private Solicitante solicitante;
    private Area area;

    public Solicitud() {
    }

    public Solicitud(Integer id, String codigo, String fecha_ingreso, String fecha_actualizacion, Integer anterior_area_id, Integer actual_area_id,
                     String estado, Integer solicitante_id, String descripcion, Solicitante solicitante, Area area) {
        this.id = id;
        this.codigo = codigo;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_actualizacion = fecha_actualizacion;
        this.anterior_area_id = anterior_area_id;
        this.actual_area_id = actual_area_id;
        this.estado = estado;
        this.solicitante_id = solicitante_id;
        this.descripcion = descripcion;
        this.solicitante = solicitante;
        this.area = area;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(String fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Integer getAnterior_area_id() {
        return anterior_area_id;
    }

    public void setAnterior_area_id(Integer anterior_area_id) {
        this.anterior_area_id = anterior_area_id;
    }

    public Integer getActual_area_id() {
        return actual_area_id;
    }

    public void setActual_area_id(Integer actual_area_id) {
        this.actual_area_id = actual_area_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getSolicitante_id() {
        return solicitante_id;
    }

    public void setSolicitante_id(Integer solicitante_id) {
        this.solicitante_id = solicitante_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
