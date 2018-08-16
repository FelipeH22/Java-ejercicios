package ejercicios_basicos;
import java.util.Scanner;

public class Noventa_y_cuatro 
{    
    public static int num;
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Digite el numero");
        num= sc.nextInt();
        verifica();
    }
    public static void verifica()
    {
       int i; 
       String mes[]= new String[13];
       mes[1]="Enero";
       mes[2]="Febrero";
       mes[3]="Marzo";
       mes[4]="Abril";
       mes[5]="Mayo";
       mes[6]="Junio";
       mes[7]="Julio";
       mes[8]="Agosto";
       mes[9]="Septiembre";
       mes[10]="Octubre";
       mes[11]="Noviembre";
       mes[12]="Diciembre";
       for(i=1;i<=12;i++)
       {
           if(num==i)
           {
               System.out.println("El numero corresponde a "+mes[i]);
           }
       }
       
    }
}
