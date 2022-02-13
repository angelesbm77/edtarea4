/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Clase CCuenta 
 * @author ANGELES
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**
 * Constructor vacío de la clase
 * CCuenta
 */
    public CCuenta()
    {
    }
/**
 * Constructo CCuenta recibiendo como parámetros
 * @param nom
 * @param cue
 * @param sal
 * @param tipo 
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Método que devuelve
 * @return saldo
 * de tipo double
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Metodo ingresar al que se le pasa como parámetro
 * @param cantidad
 * Esta cantidad se le suma al saldo de la cuenta
 * @throws Exception 
 * si la cantidad que se pasa como parámetro es 
 * un número negativo, lanza una excepcion
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método retirar al que se le pasa como parámetro
 * @param cantidad
 * que se le resta al saldo
 * @throws Exception 
 * si la cantidad que se pasa como parámetro es 
 * un número negativo, lanza una excepcion
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
     /**
     * Método que devuelve el nombre de la cuenta
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /** Método al que se le pasa como parámetro
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método al que se le pasa como parámetro
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el salda
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método al que se le pasa el saldo como parámetro
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el tipo de interés
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método al que se le pasa como parámetro
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
