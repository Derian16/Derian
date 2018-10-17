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
public class morse {

    public static void Morse() {
        Scanner entrada = new Scanner(System.in);
        int longitudMorse, i=0;
        String morse,cA=".-",cB="-...",cC="-.-.",cD="-..",cE=".",cF="..-.",cG="--.",cH="....",cI="..",cJ=".---"
                ,cK="-.-",cL=".-..",cM="--",cN="-.",cO="---",cP=".--.",cQ="--.-",cR=".-.",cS="...",cT="-",cU="..-"
                ,cV="...-",cW=".--",cX="-..-",cY="-.--",cZ="--..",c1=".----",c2="..---",c3="...--",c4="....-",c5="....."
                ,c6="-....",c7="--...",c8="---..",c9="----.",c0="------";
                
        System.out.println("_____________________CÓDIGO MORSE_____________________");
        System.out.println("|A=.-   B=-...   C=-.-.   D=-..   E=.   F=..-.   G=--.|\n"
                         + "|H=.... I=..     J=.---   K=-.-   L=.-..M=--     N=-. |\n"
                         + "|O=---  P=.--.   Q=--.-   R=.-.   S=... T=-      U..- |\n"
                         + "|V...-  W=.--    X=-..-   Y=-.--  Z=--..              |\n"
                         + "|                                                     |\n"
                         + "|1=.---- 2=..--- 3=...--  4=....- 5=..... 6=-....     |\n"
                         + "|7=--... 8=---.. 9=----.  0=------                    |\n"
                         + "|_____________________________________________________|"  );
        String LetrasMorse="";
        System.out.println("Intruduzca su texto en morse: ");
        morse=entrada.nextLine();
      
        //Divide por un espacio
        String [ ] letra = morse.split("\\ ");
        while(i < letra.length){
            if(letra[i].equals(cA)){
                 LetrasMorse=LetrasMorse.concat("A");   
               }
            if(letra[i].equals(cB)){
                 LetrasMorse=LetrasMorse.concat("B");   
               }
            if(letra[i].equals(cC)){
                 LetrasMorse=LetrasMorse.concat("C");   
               }
            if(letra[i].equals(cD)){
                 LetrasMorse=LetrasMorse.concat("D");   
               }
            if(letra[i].equals(cE)){
                 LetrasMorse=LetrasMorse.concat("E");   
               }
            if(letra[i].equals(cF)){
                 LetrasMorse=LetrasMorse.concat("F");   
               }
            if(letra[i].equals(cG)){
                 LetrasMorse=LetrasMorse.concat("G");   
               }
            if(letra[i].equals(cH)){
                 LetrasMorse=LetrasMorse.concat("H");   
               }
            if(letra[i].equals(cI)){
                 LetrasMorse=LetrasMorse.concat("I");   
               }
            if(letra[i].equals(cJ)){
                 LetrasMorse=LetrasMorse.concat("J");   
               }
            if(letra[i].equals(cK)){
                 LetrasMorse=LetrasMorse.concat("K");   
               }
            if(letra[i].equals(cL)){
                 LetrasMorse=LetrasMorse.concat("L");   
               }
            if(letra[i].equals(cM)){
                 LetrasMorse=LetrasMorse.concat("M");   
               }
            if(letra[i].equals(cN)){
                 LetrasMorse=LetrasMorse.concat("N");   
               }
            if(letra[i].equals(cO)){
                 LetrasMorse=LetrasMorse.concat("O");   
               }
            if(letra[i].equals(cP)){
                 LetrasMorse=LetrasMorse.concat("P");   
               }
            if(letra[i].equals(cQ)){
                 LetrasMorse=LetrasMorse.concat("Q");   
               }
            if(letra[i].equals(cR)){
                 LetrasMorse=LetrasMorse.concat("R");   
               }
            if(letra[i].equals(cS)){
                 LetrasMorse=LetrasMorse.concat("S");   
               }
            if(letra[i].equals(cT)){
                 LetrasMorse=LetrasMorse.concat("T");   
               }
            if(letra[i].equals(cU)){
                 LetrasMorse=LetrasMorse.concat("U");   
               }
            if(letra[i].equals(cV)){
                 LetrasMorse=LetrasMorse.concat("V");   
               }
            if(letra[i].equals(cW)){
                 LetrasMorse=LetrasMorse.concat("W");   
               }
            if(letra[i].equals(cX)){
                 LetrasMorse=LetrasMorse.concat("X");   
               }
            if(letra[i].equals(cY)){
                 LetrasMorse=LetrasMorse.concat("Y");   
               }
            if(letra[i].equals(cZ)){
                 LetrasMorse=LetrasMorse.concat("Z");   
               }
            if(letra[i].equals(c1)){
                 LetrasMorse=LetrasMorse.concat("1");   
               }
            if(letra[i].equals(c2)){
                 LetrasMorse=LetrasMorse.concat("2");   
               }
            if(letra[i].equals(c3)){
                 LetrasMorse=LetrasMorse.concat("3");   
               }
            if(letra[i].equals(c4)){
                 LetrasMorse=LetrasMorse.concat("4");   
               }
            if(letra[i].equals(c5)){
                 LetrasMorse=LetrasMorse.concat("5");   
               }
            if(letra[i].equals(c6)){
                 LetrasMorse=LetrasMorse.concat("6");   
               }
            if(letra[i].equals(c7)){
                 LetrasMorse=LetrasMorse.concat("7");   
               }
            if(letra[i].equals(c8)){
                 LetrasMorse=LetrasMorse.concat("8");   
               }
            if(letra[i].equals(c9)){
                 LetrasMorse=LetrasMorse.concat("9");   
               }
            if(letra[i].equals(c0)){
                 LetrasMorse=LetrasMorse.concat("0");   
               }
              i++;
             LetrasMorse=LetrasMorse.concat(" ");
        }
        longitudMorse=LetrasMorse.length();
        String cadena, cadena2="";
        
        int b=0;
        
        for(int j=0; j<longitudMorse; j++){
            cadena=LetrasMorse.charAt(j)+"";
            
            if (LetrasMorse.charAt(j)!=' '){//Si el caracter es distinto a un espacio
                cadena2=cadena2+LetrasMorse.charAt(j);//cadena nueva
                b=0;
            }
            else   {
                b=b+1;
                if (b==3)//Si los espacios en blanco es igual a tres
                {
                    cadena2=cadena2+" ";//Agrega un espacio en blanco para separar las palabras      
                }
            }     
        }
        System.out.println("De morse a texto es :");
        System.out.println(cadena2);      
        
      
    }
    // TODO code application logic here
}
