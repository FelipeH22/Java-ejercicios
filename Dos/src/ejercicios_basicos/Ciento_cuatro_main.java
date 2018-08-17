package ejercicios_basicos;
import ejercicios_basicos.Ciento_cuatro;
import java.util.Scanner;

public class Ciento_cuatro_main 
{
    public static void main(String[] args)
    {
        Ciento_cuatro b = new Ciento_cuatro();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre");
        b.setnombref(sc.nextLine());
        System.out.println("Ingrese el sexo");
        b.setsexof(sc.nextLine());
        System.out.println("Ingrese la edad");
        b.setedadf(sc.nextInt());
        System.out.println("Ingrese el peso en kg");
        b.setpesof(sc.nextFloat());
        System.out.println("Ingrese el color de pelo");
        b.setcolor_de_pelof(sc.nextLine());
        System.out.println("Ingrese el color de piel");
        b.setcolor_de_pielf(sc.nextLine());
        System.out.println("Ingrese el color de ojos");
        b.setcolor_de_ojosf(sc.nextLine());
        
        
        
    }        
}
