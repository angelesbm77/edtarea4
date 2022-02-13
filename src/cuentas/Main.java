/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author ANGELES
 */
public class Main {

    /**
     * Método Main
     * @param args
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }
/**
 * Metodo al que se le pasa como parámetro
 * @param cantidad 
 * y crea una cuenta 
 * se llama al metrodo saldoActual() 
 * al método retirar()
 * y al método ingresar()
 */
    private static void operativa_cuenta(float cantidad) {
        
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
