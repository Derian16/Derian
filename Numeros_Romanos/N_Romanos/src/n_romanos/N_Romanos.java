/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n_romanos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DERIAN
 */
public class N_Romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Aqui se declaran los numeros romanos,esta dividido en 4 partes unidad,decena,centena,millar
        String Unidad[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String Decena[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String Centena[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String Millar[] = {"", "M"};

        int N, u, d, c, m;
        //Este try catch sirve para que no se pueda poner letras o numeros fuera del rango que se pide
        try {
            do {
                System.out.println("Ingresa un número entre 1 y 1000:");
                N = entrada.nextInt();
                if(N>1000 || N<1){
                    System.out.println("Solo se puede ingrsar numeros entre 1 y 1000\n");
                }
            } while (N > 1000 || N<1);
            //Reciduo de unidades
            u = N % 10;
            //Reciduo de decenas
            d = (N / 10) % 10;
            //Reciduo de centena
            c = N / 100;
            //Reciduo de millar
            m = N / 1000;

            if (N >= 1000) {
                System.out.println("\n" + Millar[m]);
            } else {
                if (N >= 100) {
                    System.out.println("\n" + Centena[c] + Decena[d] + Unidad[u]);
                } else {
                    if (N >= 10) {
                        System.out.println("\n" + Decena[d] + Unidad[u]);
                    } else {
                        System.out.println("\n" + Unidad[N]);
                    }
                }
            }

        } catch (InputMismatchException ime) {
            System.out.println("Solo puedes ingresar números enteros");
            N_Romanos.main(args);
        }

        // TODO code application logic here
    }

}
