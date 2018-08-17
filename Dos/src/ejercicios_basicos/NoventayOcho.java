/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_basicos;

import java.util.Scanner;

public class NoventayOcho{
    
    void imprimir(int numero, int potencia) {
        int resultado=numero;
        
        
        for (int i = 1; i < potencia; i++) {
            resultado =  resultado * numero;
        }
        System.out.println(resultado);
    }
    
    public static void main(String[] ar) {
        NoventayOcho re=new NoventayOcho();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese numero");
        int numero =sc.nextInt();
        System.out.println("Ingrese potencia");
        int potencia = sc.nextInt();
        re.imprimir(numero,potencia);
    }
}
