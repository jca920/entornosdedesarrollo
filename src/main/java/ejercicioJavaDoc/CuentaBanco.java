package ejercicioJavaDoc;

import java.util.UUID;

/**
 *
 * Clase para representar una cuenta de banco
 *
 * Esta clase representa una cuenta de banco con propiedades como el
 * identificador
 *
 * y saldo. También incluye métodos para realizar ingresos y retiradas de
 * efectivo.
 *
 *
 * @since 2.0.0
 *
 * @version 2.1.0
 */
public class CuentaBanco {

    /**
     * El identificador de la cuenta de banco.
     *
     * @var String
     */
    private String id;
    /**
     *
     * El valor del saldo de la cuenta.
     *
     * @var float
     */
    private float saldo;

    /**
     *
     * Constructor de la clase CuentaBanco.
     *
     * @param saldo El saldo de la cuenta de banco.
     */
    public CuentaBanco(float saldo) {
        this.id = UUID.randomUUID().toString();
        this.saldo = saldo;
    }

    /**
     *
     * Obtiene el identificador de la cuenta de banco.
     *
     * @return El identificador de la cuenta de banco.
     */
    public String getId() {
        return this.id;
    }

    /**
     *
     * Obtiene el saldo de la cuenta de banco.
     *
     * @return El saldo de la cuenta de banco.
     */
    public float getSaldo() {
        return this.saldo;
    }

    /**
     *
     * Establece el identificador de la cuenta de banco.
     *
     * @param id El identificador de la cuenta de banco.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * Establece el saldo de la cuenta de banco.
     *
     * @param saldo El saldo de la cuenta de banco.
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * Realiza un ingreso en la cuenta de banco.
     *
     * @param cantidad La cantidad a ingresar en la cuenta de banco.
     * @return El saldo de la cuenta de banco.
     */
    public float ingreso(float cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
        return this.saldo;
    }

    /**
     *
     * Realiza una retirada de la cuenta de banco.
     *
     * @param cantidad La cantidad a retirar de la cuenta de banco.
     * @return El saldo de la cuenta de banco.
     * @throws Exception Excepción por intentar retirar dinero de una cuenta sin
     *                   suficientes fondos.
     */
    public float retirada(float cantidad) throws Exception {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return this.saldo;
        } else {
            throw new Exception("La retirada no puede realizarse por falta de fondos");
        }
    }
}
