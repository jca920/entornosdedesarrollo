package Semaforo.clases;

import Semaforo.principal.ordenador;

public class estudiante extends persona {
    int Curso;

    public estudiante() {
        setEdad(25);
        Nombre = "Luis";
        Curso = 1;
    }

    public void presentarse(){
        System.out.println("Soy " + Nombre + " Alumno de " + Curso + "º y 	tengo una edad de: " + getEdad());
    }

    public String preguntacolor(){
        presentarse();
        ordenador mipc = new ordenador();
        return mipc.color();
    }
}

