package ejercicios_basicos;
import java.util.Scanner;

public class Ciento_cuatro 
{
    public int cantidad;
    class persona
    {
        String nombre;
        String sexo;
        int edad;
        float peso;
        String color_de_pelo; 
        String color_de_piel;  
        String color_de_ojos;
        String nacionalidad;
        double telefono;
        public void cantidad_datos()
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("Digite la cantidad de personas a registrar");
            cantidad=sc.nextInt();        
        }
        public void nombref(String name)
        {
            this.nombre=name;
        }
        public void sexof(String sex)
        {
            this.sexo=sex;
        }
        public void edadf(int age)
        {
            this.edad=age;
        }
        public void pesof(float w)
        {
            this.peso=w;
        }
        public void color_de_pelof(String hcolor)
        {
            this.color_de_pelo=hcolor;
        }
        public void color_de_pielf(String scolor)
        {
            this.color_de_piel=scolor;
        }
        public void color_de_ojosf(String ecolor)
        {
            this.color_de_ojos=ecolor;
        }
        public void nacionalidadf(String nationality)
        {
            this.nacionalidad=nationality;
        }
         public void telefonof(double phone)
        {
            this.telefono=phone;
        }
         
    }
}

   