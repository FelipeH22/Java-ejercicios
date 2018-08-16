package ejercicios_basicos;
import java.util.Scanner;


public class Ochenta_y_siete
{
    public static int x;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Digite el numero");
	x= sc.nextInt();
	incremento();
    }
    public static void incremento()
    {
	x=x+1;
	System.out.println("El incremento es: "+x+ "\n");
    }
}
