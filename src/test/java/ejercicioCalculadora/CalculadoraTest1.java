package ejercicioCalculadora;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest1 {

    private Calculadora calc;

    @BeforeAll
    static void iniciarSuite() {
        System.out.println("== INICIO DE TODAS LAS PRUEBAS ==");
    }

    @BeforeEach
    void inicializar() {
        calc = new Calculadora(20, 10);
        System.out.println("Iniciando una nueva prueba...");
    }

    @AfterEach
    void limpiar() {
        System.out.println("Prueba finalizada.\n");
    }

    @AfterAll
    static void finalizarSuite() {
        System.out.println("== FIN DE TODAS LAS PRUEBAS ==");
    }

    @Test
    @DisplayName("Prueba de suma correcta")
    void testSuma() {
        assertEquals(30, calc.suma(), "La suma debería dar 30");
    }

    @Test
    @DisplayName("Prueba de resta correcta")
    void testResta() {
        assertEquals(10, calc.resta());
    }

    @Test
    @Disabled("Aún no implementado correctamente")
    void testMultiplicaPendiente() {
        fail("Este test está deshabilitado temporalmente");
    }
}
