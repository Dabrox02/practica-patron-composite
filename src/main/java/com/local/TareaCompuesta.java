package com.local;

import java.util.ArrayList;

public class TareaCompuesta extends Tarea {

    public TareaCompuesta(String descripcion, int tiempoRequerido) {
        super(descripcion, tiempoRequerido);
        tareas = new ArrayList<>();
    }

    @Override
    public void agregar(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public void remover(Tarea tarea) {
        tareas.remove(tarea);
    }

    @Override
    public void visualizarTareas(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(" -");
        }
        System.out.println("Tarea: " + this.getDescripcion());
        for (Tarea tarea : tareas) {
            tarea.visualizarTareas(space + 1);
        }
    }

    @Override
    public int visualizarTiempo() {
        int totalTiempo = this.getTiempoRequerido();
        for (Tarea tarea : tareas) {
            totalTiempo += tarea.visualizarTiempo();
        }
        return totalTiempo;
    }

}
