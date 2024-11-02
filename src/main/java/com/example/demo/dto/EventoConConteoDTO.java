package com.example.demo.dto;

import java.sql.Date;
import java.sql.Time;

public class EventoConConteoDTO {

    private String nombre;
    private Date fecha;
    private Time hora;
    private String ubicacion;
    private Integer capacidadMaxima;
    private Long conteoPersonas;
    private String estado;

    public EventoConConteoDTO(String nombre, Date fecha, Time hora, String ubicacion, Integer capacidadMaxima, Long conteoPersonas, String estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.capacidadMaxima = capacidadMaxima;
        this.conteoPersonas = conteoPersonas;
        this.estado = estado;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public Time getHora() { return hora; }
    public void setHora(Time hora) { this.hora = hora; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public Integer getCapacidadMaxima() { return capacidadMaxima; }
    public void setCapacidadMaxima(Integer capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }

    public Long getConteoPersonas() { return conteoPersonas; }
    public void setConteoPersonas(Long conteoPersonas) { this.conteoPersonas = conteoPersonas; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
