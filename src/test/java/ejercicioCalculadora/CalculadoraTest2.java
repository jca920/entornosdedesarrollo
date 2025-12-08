package ejercicioCalculadora;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase CalculadoraNombreApellido.
 * Incluye ejemplos de anotaciones avanzadas y pruebas parametrizadas con JUnit 5.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculadoraTest2 {

    private static int contadorPruebas;
    private Calculadora calc;

    // ---------- Inicialización global ----------
    @BeforeAll
    static void iniciarSuiteDePruebas() {
        System.out.println("=== INICIO DE LA SUITE DE PRUEBAS ===");
        contadorPruebas = 0;
    }
    @AfterAll
    static void finalizarSuiteDePruebas() {
        System.out.println("=== FIN DE LA SUITE DE PRUEBAS ===");
        System.out.println("Total de pruebas ejecutadas: " + contadorPruebas);
    }

    // ---------- Inicialización por cada prueba ----------
    @BeforeEach
    void setUp() {
        calc = new Calculadora(20, 10);
        contadorPruebas++;
        System.out.println("\n--> Iniciando prueba " + contadorPruebas);
    }
    @AfterEach
    void tearDown() {
        System.out.println("--> Prueba finalizada.");
    }

    // ---------- Pruebas básicas ----------
    @Test
    @Order(1)
    @Tag("basico")
    @DisplayName("Comprobación básica del método suma()")
    void testSumaBasica() {
        assertEquals(30, calc.suma(), "La suma debería devolver 30");
    }
    @Test
    @Order(2)
    @Tag("basico")
    @DisplayName("Comprobación básica del método resta()")
    void testRestaBasica() {
        assertEquals(10, calc.resta(), "La resta debería devolver 10");
    }
    @Order(3)
    @Tag("multiplicacion")
    @RepeatedTest(3)
    @DisplayName("Prueba repetida del método multiplica()")
    void testMultiplicacionRepetida() {
        assertEquals(200, calc.multiplica(), "El producto debe ser 200");
    }
    @Test
    @Order(4)
    @Tag("pendiente")
    @Disabled("Pendiente de revisión del método divide()")
    void testDivisionDeshabilitada() {
        fail("Test deshabilitado temporalmente.");
    }

    // ---------- Pruebas parametrizadas ----------
    @Order(5)
    @ParameterizedTest
    @Tag("parametrizada")
    @ValueSource(ints = {1, 5, 10, 20})
    @DisplayName("Prueba parametrizada de suma con valores positivos")
    void testSumaConParametros(int valor) {
        Calculadora calc = new Calculadora(valor, 10);
        assertTrue(calc.suma() > 0, "La suma debe ser positiva");
    }
    @Order(6)
    @ParameterizedTest
    @Tag("parametrizada")
    @CsvSource({
            "20,10,30",
            "15,5,20",
            "50,25,75"
    })
    @DisplayName("Prueba parametrizada con múltiples conjuntos de datos")
    void testSumaConVariosValores(int a, int b, int resultadoEsperado) {
        Calculadora calc = new Calculadora(a, b);
        assertEquals(resultadoEsperado, calc.suma(),
                () -> "Error en la suma con valores: " + a + " y " + b);
    }

    // ---------- Pruebas adicionales ----------
    @Test
    @Order(7)
    @Tag("validacion")
    @DisplayName("Comprobación de que el objeto Calculadora no es nulo")
    void testObjetoNoNulo() {
        assertNotNull(calc, "El objeto calculadora debería haberse inicializado en setUp().");
    }
    @Test
    @Order(8)
    @Tag("division")
    @DisplayName("Verificación del resultado de la división")
    void testDivisionCorrecta() {
        assertEquals(2, calc.divide());
        assertTrue(calc.divide() > 0, "El resultado debe ser mayor que 0");
    }
    @Test
    @Order(9)
    @Tag("errores")
    @DisplayName("Comprobación de división por cero con assertThrows()")
    void testDivisionPorCero() {
        Calculadora calc = new Calculadora(20, 0);
        assertThrows(ArithmeticException.class, () -> calc.divide(),
                "Debería lanzarse una excepción al dividir por cero.");
    }
}

