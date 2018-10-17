/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;
/**
 *
 * @author DERIAN
 */
public class Cubo extends Cuadrado{
    public static double perimetroC,volumen;
    public static void CalcularVolumen(){
        volumen=lado*lado*lado;
        System.out.println("El volumen del cubo es: "+volumen);
    }
    
    public static void CalcularPerimetro(){
        perimetroC=12*lado;
        
        System.out.println("El perimetro del cubo es: "+perimetroC);
    }
}
