/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author DERIAN
 */
public class Cuadrado{
    public static double lado,area,perimetro;
    public static void CalcularArea(){
        area=lado*lado;
        System.out.println("El area del cuadrado es: "+area);
    }
    
    public static void CalcularPerimetro(){
        perimetro=lado*4;
        System.out.println("El perimetro del cuadrado es: "+perimetro);
    }
}
