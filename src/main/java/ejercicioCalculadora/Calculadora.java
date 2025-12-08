package ejercicioCalculadora;

public class Calculadora {
    private final int num1;
    private final int num2;

    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }
    public int suma() {
        return num1 + num2;
    }
    public int resta() {
        return num1 - num2;
    }
    public int multiplica() {
        return num1 * num2;
    }
    public int divide() {
        return num1 / num2;
    }
    public int resta2() {
        return num1 >= num2 ? num1 - num2 : num2 - num1;
    }
    public int divide2() {
        if (num2 == 0) return 0;
        return num1 / num2;
    }
}
