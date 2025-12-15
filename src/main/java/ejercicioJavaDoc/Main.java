package ejercicioJavaDoc;

/**
 *
 * Clase principal que muestra el funcionamiento de la aplicación
 *
 * Esta clase crea dos cuentas bancarias y realiza operaciones de ingreso y
 * retirada
 *
 * @author daw/dam-profesor
 *
 * @version 1.0.0
 *
 * @since 1.0.0
 */
public class Main {

    /**
     *
     * Método principal de la aplicación
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {

// Se crean dos cuentas bancarias con un saldo inicial
        CuentaBanco cuenta1 = new CuentaBanco(150);
        CuentaBanco cuenta2 = new CuentaBanco(300);

// Se realiza un ingreso en la cuenta1 y una retirada en la cuenta2
        cuenta1.ingreso(10);
        try {
            cuenta2.retirada(50);
        } catch (Exception e) {
            e.printStackTrace();
        }

// Se muestran los saldos de ambas cuentas
        System.out.println("La cuenta " + cuenta1.getId() + " tiene un saldo de " + cuenta1.getSaldo());
        System.out.println("La cuenta " + cuenta2.getId() + " tiene un saldo de " + cuenta2.getSaldo());
    }
}
