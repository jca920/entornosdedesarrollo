package Semaforo.clases;

public class profesor extends persona {
    public profesor() {
    }

    public String preguntacolor() {
        return obtColor();
    }

    private static String obtColor() {
        estudiante alumno = new estudiante();
        return alumno.preguntacolor();
    }
}
