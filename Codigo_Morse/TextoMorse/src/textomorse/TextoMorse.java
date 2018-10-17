/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textomorse;

import java.util.Scanner;

/**
 *
 * @author DERIAN
 */
public class TextoMorse{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion;
        
        System.out.println("1.-Morse\n"
                + "2.-Texto\n"
                + "Elija una opcion:");
        opcion=entrada.next();
        
        if (opcion.equals("1") || opcion.equalsIgnoreCase("morse")){
            morse.Morse();
        }else
            if (opcion.equals("2") || opcion.equalsIgnoreCase("texto")){
                texto.Texto();
            }
        // TODO code application logic here
    }
    
}
