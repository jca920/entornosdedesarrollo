package ejercicioCalculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSuma() {
        // Valor esperado
        int valorEsperado = 30;

        // Crear el objeto con los valores de entrada
        Calculadora calc = new Calculadora(20, 10);

        // Ejecutar el método a probar
        int resultado = calc.suma();

        // Verificar el resultado
        assertEquals(valorEsperado, resultado, "La suma no coincide con el valor esperado.");
    }
    @Test
    void testResta() {
        int valorEsperado = 10;
        Calculadora calc = new Calculadora(20, 10);
        int resultado = calc.resta();
        assertEquals(valorEsperado, resultado, "La resta no coincide con el valor esperado.");
    }
    @Test
    void testMultiplica() {
        int valorEsperado = 200;
        Calculadora calc = new Calculadora(20, 10);
        int resultado = calc.multiplica();
        assertEquals(valorEsperado, resultado, "La multiplicación no coincide con el valor esperado.");
    }
    @Test
    void testDivide() {
        int valorEsperado = 2;
        Calculadora calc = new Calculadora(20, 10);
        int resultado = calc.divide();
        assertEquals(valorEsperado, resultado, "La división no coincide con el valor esperado.");
    }
    @Test
    public void testDivCero() {
        try {
            Calculadora calc = new Calculadora (20, 0);
            double resultado = calc.divide();
            fail("Fallo. Debería haber lanzado la excepción");
        }catch (ArithmeticException e) {
            //La prueba ha ido bien
        }
    }
    @Test
    void testDividePorCero() {
        Calculadora calc = new Calculadora(20, 0);
        assertThrows(ArithmeticException.class, () -> {
            calc.divide();
        }, "Error: No se lanzó la excepción esperada de división por cero.");
    }
    @Test
    void testResta2() {
        Calculadora calc = new Calculadora(10, 20);
        int valorEsperado = 10;
        int resultado = calc.resta2();
        assertEquals(valorEsperado, resultado, "La resta modificada no funciona correctamente.");
    }
    @Test
    void testDivide2() {
        Calculadora calc = new Calculadora(20, 0);
        int valorEsperado = 0;
        int resultado = calc.divide2();
        assertEquals(valorEsperado, resultado, "La división modificada no funciona correctamente.");
    }
}