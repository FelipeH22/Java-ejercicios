package ejercicios_basicos;
import java.util.Scanner;
public class Veintisiete
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
	System.out.println("Ingrese el numero a \n");
	a= sc.nextInt();
	if (100==a)
		System.out.println("El numero es igual a 100");
	if(100>a)	
		System.out.println("El numero es menor a 100");
	if(100<a)
		System.out.println("El numero es mayor a 100");
    }
}
