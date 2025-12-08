package ejerciciosDepuración;

import java.util.Scanner;

public class testNumeros {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("Indica el inicio: ");
        int inicio = lectura.nextInt();

        System.out.println("Indica el límite: ");
        int limite = lectura.nextInt();

        lectura.close();

        //int division = limite / inicio;
        if (inicio != 0) {
            int division = limite/inicio;
            System.out.println("limite/inicio: " + division);
        }else{
            System.out.println("limite/inicio: infinito");
        }

        //System.out.println("limite/inicio: " + division);

        System.out.println("\n\nNúmeros primos desde " + inicio + " hasta " + limite + ":");

        // Iterar a través de los números hasta el límite superior
        for (int i = inicio; i <= limite; i++) {
            // Verificar si el número es primo
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nNúmeros mágicos:");
        // Iterar a través de los números hasta el límite superior
        int i = inicio;
        while (i <= limite) {
            // Verificar si el número es par y primo
            if (esPar(i) && esPrimo(i)) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\n\nNúmeros pares desde " + inicio + " hasta " + limite + ":");
        // Iterar a través de los números hasta el límite superior
        i = inicio;
        while (i <= limite) {
            // Verificar si el número es primo
            if (esPar(i)) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\n\nNúmeros impares desde " + inicio + " hasta " + limite + ":");
        // Iterar a través de los números hasta el límite superior
        i = inicio;
        while (i <= limite) {
            // Verificar si el número es primo
            if (!esPar(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para verificar si un número es par
    public static boolean esPar(int num) {

        if (num < 0) {
            return false;
        }

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}