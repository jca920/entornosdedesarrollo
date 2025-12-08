package Semaforo.principal;

import Semaforo.clases.profesor;

public class clasecolor {
    public static final String PRIMER_PARÁMETRO = "Primer parámetro";
    private static String color;

    public static void main(String[] args) {
        profesor tch = new profesor();
        color = tch.preguntacolor();
        final var mensaje = "La respuesta recibida es:";
        System.out.println(mensaje + color);
    }

    public static void cambSig(int iPUno, int iPDos){
        System.out.println(PRIMER_PARÁMETRO + iPUno);
        System.out.println("Segundo parámetro" + iPDos);
    }


}

