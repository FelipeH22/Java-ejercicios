package ejercicios_basicos;
import java.util.Scanner;

public class Tres 
{
 public static void main(String[] args) 
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el primer numero: \n");
	a = sc.nextInt();
	System.out.println("Ingrese el segundo numero: \n");
	b = sc.nextInt();
        c=a+b;
	System.out.println("La suma de "+a+" + "+b+" es:"+c+"\n");
    }   
}
