/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author melissa.a.lopez
 */
public class Numero {

    /**
     * @param args the command line arguments
     */
    static int numero;

    public static int[] serie_primos(int numero) {

        int contadorNumPrimo = 0;

        for (int index = 2; index < numero; index++) {
            boolean esPrimo = true;

            for (int i = 2; i < index; i++) {
                if (index % i == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                contadorNumPrimo++;
            }
        }

        int[] arregloNumPrimos = new int[contadorNumPrimo];

        int contador = 0;

        for (int index = 2; index < numero; index++) {
            boolean esPrimo = true;

            for (int i = 2; i < index; i++) {
                if (index % i == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                arregloNumPrimos[contador] = index;
                contador++;
            }
        }

        return arregloNumPrimos;
    }

    public static int[] serie_fibonacci(int numero) {

        //int[] arrregloNumFib = new int[numero];
        //arrregloNumFib[1] = 1;
        int contadorNumFib = 0;

        int t1 = 0, t2 = 1;
        while (t1 <= numero) {

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            //arrregloNumFib[t1] = sum;
            contadorNumFib++;
        }

        int[] arrregloNumFib = new int[contadorNumFib];
        arrregloNumFib[1] = 1;
        for (int i = 2; i < contadorNumFib; i++) {
            arrregloNumFib[i] = arrregloNumFib[i - 1] + arrregloNumFib[i - 2];
        }
        return arrregloNumFib;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Mostras los numeros entre 1 - ");
        numero = input.nextInt();
        System.out.println("Números primos:");
        System.out.println(Arrays.toString(serie_primos(numero)));
        System.out.println("Sucesión de Fibonacci:");
        System.out.println(Arrays.toString(serie_fibonacci(numero)));

    }

}
