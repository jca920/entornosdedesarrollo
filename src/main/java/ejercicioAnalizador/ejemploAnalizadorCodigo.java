package ejercicioAnalizador;

public class ejemploAnalizadorCodigo {

    public static void main(String[] args) {
        ejemploAnalizadorCodigo ejemplo = new ejemploAnalizadorCodigo();
        boolean resultado = ejemplo.esValorEsperado(5);
        System.out.println("Resultado: " + resultado);
    }

    public boolean esValorEsperado(int valor) {
        return valor == obtenerValorActual();
    }

    private int obtenerValorActual() {
        //Simula obtener el valor desde una fuente externa o variable dinámica
        return (int) (Math.random() * 10);
    }
}





