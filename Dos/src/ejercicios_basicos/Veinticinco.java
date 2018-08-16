package ejercicios_basicos;
import java.util.Scanner;

public class Veinticinco 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n1,n2,n3;
	System.out.println("Ingrese numero 1 \n");
	n1= sc.nextInt();
	System.out.println("Ingrese numero 2 \n");
	n2= sc.nextInt();
	System.out.println("Ingrese numero 3 \n");
	n3= sc.nextInt();		
	if(n1>=n2&&n2>=n3)
		System.out.println("Numeros Ingresados en orden decreciente \n");
	else
	{
		if(n3>=n2&&n2>=n1)
			System.out.println("Numeros ingresados en orden creciente \n");
		else
			System.out.println("Los numeros ingresados no poseen orden \n");
	}

    }
}
