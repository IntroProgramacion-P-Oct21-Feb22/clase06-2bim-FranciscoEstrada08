/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author PersonaL-CTI
 */
public class DatoFinal {
    public static double ObtenerPromedio(double[] n){
        double suma = 0;
        double promedio;
        
        for (int i = 0; i < n.length;i++){
            suma = suma + n[i];
        }
        promedio= suma/n.length;
        
        return promedio;
    }

}
