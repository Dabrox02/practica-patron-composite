package com.local;

import java.util.List;

public abstract class Tarea {

    private String descripcion;
    private int tiempoRequerido;
    protected List<Tarea> tareas;

    public Tarea(String descripcion, int tiempoRequerido) {
        this.descripcion = descripcion;
        this.tiempoRequerido = tiempoRequerido;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoRequerido() {
        return this.tiempoRequerido;
    }

    public void setTiempoRequerido(int tiempoRequerido) {
        this.tiempoRequerido = tiempoRequerido;
    }

    public abstract void agregar(Tarea tarea);

    public abstract void remover(Tarea tarea);

    public abstract void visualizarTareas(int space);

    public abstract int visualizarTiempo();

}
