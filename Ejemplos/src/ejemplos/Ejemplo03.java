/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

// import java.security.SecureRandom;
import java.security.SecureRandom;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // TODO code application logic here
        int valores[] = obtenerNumero();
        int suma = obtnerSuma(valores);
        

        System.out.printf("La suma de %d + %d + %d + %d + %d es igual a: %d\n",
                valores[0],
                valores[1],
                valores[2],
                valores[3],
                valores[4], suma);

    }

    public static int[] obtenerNumero() {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();

        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int[] valores = new int[5];

        int valorAleatorio = numerosAleatorios.nextInt(5);

        for (int i = 0; i < valores.length; i++) {
            valores[i] = numerosAleatorios.nextInt(5);
        }
        return valores;
    }

    public static int obtnerSuma(int a[]) {
        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        return suma;
    }

}
