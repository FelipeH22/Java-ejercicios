/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_basicos;
import java.util.Scanner;
 /**
 *
 * @author Rapter
 */
public class NoventayNueve {
    int factorial(int fact) {
        if (fact>0) {
            int valor=fact * factorial(fact-1);
            return valor;
        } else
            return 1;
    }
    
    public static void main(String[] ar) {
        NoventayNueve re =new NoventayNueve();Scanner sc = new Scanner(System.in);        
        System.out.println("Ingrese numero");
        int numero =sc.nextInt();
        int f=re.factorial(numero);
        System.out.println("El factorial de " +numero+ " es "+f);
    }
}