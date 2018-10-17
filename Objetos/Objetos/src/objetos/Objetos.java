/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DERIAN
 */
public class Objetos extends Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion, desicion;

        do {
            do {
                try {
                    System.out.println("Ingrese la medida del lado: ");
                    lado = entrada.nextDouble();
                } catch (InputMismatchException ime) {
                    System.out.println("Ingrese numeros por favor");
                    Objetos.main(args);
                }
                do {
                    System.out.println("El medida es: " + lado);
                    System.out.println("1.-Cuadrado\n"
                            + "2.-Cubo\n"
                            + "3.-Cancelar\n"
                            + "4.-Salir\n"
                            + "Elija una opcion: ");
                    opcion = entrada.next();

                    if (opcion.equals("1") || opcion.equalsIgnoreCase("cuadrado")) {
                        Cuadrado.CalcularArea();
                        Cuadrado.CalcularPerimetro();
                    } else if (opcion.equals("2") || opcion.equalsIgnoreCase("cubo")) {
                        Cubo.CalcularVolumen();
                        Cubo.CalcularPerimetro();
                    } else if (opcion.equals("4") || opcion.equalsIgnoreCase("salir")) {
                        System.exit(0);
                    }
                    
                    System.out.println("\n\n Opciones de salir\n"
                            + "1.-Menú de cálculos\n"
                            + "2.-Pedir nueva medida de lado:");
                    desicion = entrada.next();
                } while (desicion.equals("1") || desicion.equalsIgnoreCase("menu de calculos") || desicion.equalsIgnoreCase("menú de cálculos"));
            } while (desicion.equals("2") || desicion.equalsIgnoreCase("pedir nueva medida de lado"));
        } while (opcion.equals("3") || opcion.equalsIgnoreCase("cancelar"));

        // TODO code application logic here
    }

}
