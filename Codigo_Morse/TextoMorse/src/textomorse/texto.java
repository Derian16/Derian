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
public class texto {
    public static void Texto(){
        Scanner entrada = new Scanner(System.in);
        String opcion;
        char c;
        
            String mensaje = "";

        System.out.println("Introduzca el texto: ");
        mensaje = entrada.nextLine();
        String letras = "abcdefghijklmnopqrstuvwxyz0123456789";

        mensaje = mensaje.toLowerCase();
        String codigoM[] = new String[36];
        String codigoT[] = new String[36];
        String espacio = "   ";
        String morse = " ";

        codigoM[0] = ".-"; 		//A
        codigoM[1] = "-...";		//B
        codigoM[2] = "-.-.";		//C
        codigoM[3] = "-..";		//D
        codigoM[4] = ".";		//E
        codigoM[5] = "..-.";		//F
        codigoM[6] = "--.";		//G
        codigoM[7] = "....";		//H
        codigoM[8] = "..";		//I
        codigoM[9] = ".---";		//J
        codigoM[10] = "-.-";		//K
        codigoM[11] = ".-..";	        //L
        codigoM[12] = "--";		//M
        codigoM[13] = "-.";		//N
        codigoM[14] = "---";		//O
        codigoM[15] = ".--.";	        //P
        codigoM[16] = "--.-";	        //Q
        codigoM[17] = ".-.";		//R
        codigoM[18] = "...";		//S
        codigoM[19] = "-";		//T
        codigoM[20] = "..-";		//U
        codigoM[21] = "...-";	        //V
        codigoM[22] = ".--";		//W
        codigoM[23] = "-..-";	        //X
        codigoM[24] = "-.--";	        //Y
        codigoM[25] = "--..";	        //Z
        codigoM[26] = "-----";	//0
        codigoM[27] = ".----";	//1
        codigoM[28] = "..---";	//2
        codigoM[29] = "...--";	//3
        codigoM[30] = "....-";	//4
        codigoM[31] = ".....";	//5
        codigoM[32] = "-....";	//6
        codigoM[33] = "--...";	//7
        codigoM[34] = "---..";	//8
        codigoM[35] = "----.";	//9

        for (int i = 0; i < mensaje.length(); i++) {
            if (mensaje.charAt(i) == ' ') {
                morse = morse + espacio + ' ';

            } else {
                for (int j = 0; j < letras.length(); j++) {
                    if (mensaje.charAt(i) == letras.charAt(j)) { /*se busca el caracter que coincida con el
                                                                  numero de posicion*/
                        morse = morse + codigoM[j] + ' ';	// Cuando no hay letras se eliminan

                    }
                }
            }
        }

        morse = morse.substring(1, morse.length());
        //Quita el exceso de espacio

        System.out.println(morse);

        // TODO code application logic here
        
        
    }
}
