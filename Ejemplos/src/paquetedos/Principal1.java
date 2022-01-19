/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;


import paquete03.*;
import paqueteuno.Operador;

public class Principal1 {
    
    public static void main(String[] args) {
        int valorA = Operador.obtenerNumero();
        int valorB = Operador.obtenerNumero();
        int suma = Operador.obtenerSuma(valorA, valorB);
        System.out.printf("La suma de %d + %d es igual a: %d\n", 
                valorA,
                valorB,
                suma);
    }
}
