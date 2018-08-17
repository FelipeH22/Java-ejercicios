package ejercicios_basicos;
import java.util.Scanner;

public class Ciento_cuatro 
{
    String[] telefono = new String[20];
    String[] nombre = new String[30];
    String[] sexo = new String[30];
    String[] edad = new String[30];
    String[] peso = new String[30];
    String[] nacionalidad = new String[30];
    String[] colordepelo = new String[30];
    String[] colordepiel = new String[30];
    String[] colordeojos = new String[30];
    String palabra ;

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }   

    
    public void setTelefono(String telefono, int position) {
        this.telefono[position]= telefono;
    }

    public void setNombre(String nombre, int position) {
        this.nombre[position] = nombre;
    }

    public void setSexo(String sexo, int position ) {
        this.sexo[position] = sexo;
    }

    public void setEdad(String edad, int position) {
        this.edad[position] = edad;
    }

    public void setPeso(String peso, int position) {
        this.peso[position] = peso;
    }

    public void setNacionalidad(String nacionalidad, int position) {
        this.nacionalidad [position]= nacionalidad;
    }

    public void setColordepelo(String colordepelo, int position) {
        this.colordepelo[position] = colordepelo;
    }

    public void setColordepiel(String colordepiel, int position) {
        this.colordepiel [position]= colordepiel;
    }

    public void setColordeojos(String colordeojos, int position) {
        this.colordeojos [position]= colordeojos;
    }
    
    

    public String[] getTelefono() {
        return telefono;
    }

    public String[] getNombre() {
        return nombre;
    }

    public String[] getSexo() {
        return sexo;
    }

    public String[] getEdad() {
        return edad;
    }

    public String[] getPeso() {
        return peso;
    }

    public String[] getNacionalidad() {
        return nacionalidad;
    }
    
    public void almacenar(){

    }  
    
    
    public void busqueda(int x, int cant_estu)	{
        int i;
        System.out.println("Palabra a buscar: "+this.palabra);
        
        switch(x)
        {
            case 1: 
            {
                for(i=0;i<cant_estu;i++){
                if(nombre[i]==this.palabra)
                System.out.println("El dato existe en el usuario con nombre "+getNombre()+"   ");
                else
                System.out.println("El dato no existe");
                }
                break;

            }
            case 2: 
            {
                for(i=0;i<cant_estu;i++)	
                {
                if(sexo[i]==this.palabra)
                System.out.println("El dato existe en el usuario con nombre "+getNombre()+"   ");
                else
                System.out.println("El dato no existe");
                }
                break;

            }
            case 3: 
            {
                for(i=0;i<cant_estu;i++)	
                {
                if(edad[i]==this.palabra)
                System.out.println("El dato existe en el usuario con nombre "+getNombre()+"   ");
                else
                System.out.println("El dato no existe");
                }
                break;

            }
            case 4: 
            {
                for(i=0;i<cant_estu;i++)	
                {
                if(peso[i]==this.palabra)
                System.out.println("El dato existe en el usuario con nombre "+getNombre()+"   ");
                else
                System.out.println("El dato no existe");
                }
                break;

            }
            case 5: 
            {
                for(i=0;i<cant_estu;i++)	
                {
                if(colordepelo[i]==this.palabra)
                System.out.println("El dato existe en el usuario con nombre "+getNombre()+"   ");
                else
                System.out.println("El dato no existe");
                }
                break;
            }
            case 6: 
            {
                for(i=0;i<cant_estu;i++)	
                {
                if(colordepiel[i]==this.palabra)
                System.out.println("El dato existe en el usuario con nombre "+getNombre()+"   ");
                else
                System.out.println("El dato no existe");
                }
                break;

            }
            case 7: 
            {
                for(i=0;i<cant_estu;i++)	
                {
                if(colordeojos[i]==this.palabra)
                System.out.println("El dato existe en el usuario con nombre "+getNombre()+"   ");
                else
                System.out.println("El dato no existe");
                }
                break;
            }
            case 8: 
            {
                for(i=0;i<cant_estu;i++)	
                {
                if(nacionalidad[i]==this.palabra)
                System.out.println("El dato existe en el usuario con nombre "+getNombre()+"   ");
                else
                System.out.println("El dato no existe");
                }
                break;

            }
            case 9: 
            {
                for(i=0;i<cant_estu;i++)	
                {
                if(telefono[i]==this.palabra)
                System.out.println("El dato existe en el usuario con nombre "+getNombre()+"   ");
                else
                System.out.println("El dato no existe");
                }
                break;

            }

        }	

}
    
}