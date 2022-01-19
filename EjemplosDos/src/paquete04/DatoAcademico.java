/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author PersonaL-CTI
 */
public class DatoAcademico {
    public static double[] obtenerNotas(int n){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] notas = new double[n];
        
        for(int i = 0; i<n;i++){
            System.out.println("Ingrese su nota");
            notas[i] = entrada.nextDouble();
        }
        return notas;
    }
}
