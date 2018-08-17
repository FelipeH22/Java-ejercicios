package ejercicios_basicos;

public class Cincuenta_y_cuatro 
{
    public static void main(String[] args)
    {
        int i;
        int arreglo[]=new int[50];
        for(i=1;i<=100;i=i+2)
        {
            arreglo[i]=i;
        }
        for(i=1;i<=50;i++)
        {
            System.out.println(arreglo[i]);
        }
    }
}

