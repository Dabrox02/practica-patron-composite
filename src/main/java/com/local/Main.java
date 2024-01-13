package com.local;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        Tarea ta1 = new TareaCompuesta("Hacer aseo", 0);
        Tarea ta2 = new TareaCompuesta("Limpiar cama", 5);
        Tarea ta3 = new TareaCompuesta("Limpiar Baño", 8);
        Tarea ta4 = new TareaCompuesta("Leer", 15);

        // Creamos una tarea compuesta de tareas
        ta1.agregar(ta2);
        ta1.agregar(ta3);

        // Agregamos tareas a la lista de tareas
        tareas.add(ta1);
        tareas.add(ta4);

        for (Tarea tarea : tareas) {
            tarea.visualizarTareas(0);
            System.out.println("Duracion de la tarea: " + tarea.visualizarTiempo());
        }
    }
}