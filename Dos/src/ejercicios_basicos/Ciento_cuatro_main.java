package ejercicios_basicos;
import ejercicios_basicos.Ciento_cuatro;
import java.util.Scanner;

public class Ciento_cuatro_main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                
        Ciento_cuatro cc = new Ciento_cuatro();
        
         System.out.println("Cuantos estudiantes desea registrar");
        int cant_estu = sc.nextInt();
        
	for(int x=0; x<cant_estu; x++){
            System.out.println("Registro persona\n");
            
            System.out.println("Digite nombre ");
            String nombre =sc.nextLine();
            cc.setNombre(nombre, x);/*estudiante.nombre[x];*/
            
            System.out.println("Digite edad ");
            String edad =sc.nextLine();
            cc.setEdad(edad, x);/*estudiante.edad[x];*/
            
            System.out.println("Digite sexo ");
            String sexo =sc.nextLine();
            cc.setSexo(sexo, x);/*estudiante.sexo[x];*/
            
            System.out.println("Digite nacionalidad ");
            String nacionalidad =sc.nextLine();
            cc.setNacionalidad(nacionalidad,x);/*estudiante.nacionalidad[x];*/
            
            System.out.println("Digite telefono ");
            String telefono =sc.nextLine();
            cc.setTelefono(telefono, x);/*estudiante.telefono[x];*/
            
            System.out.println("Digite peso ");
            String peso =sc.nextLine();
            cc.setPeso(peso, x);/*estudiante.peso[x];*/
            
            System.out.println("Digite color de piel ");
            String color_piel =sc.nextLine();
            cc.setColordepiel(color_piel,x);/*.colordepiel[x];*/
            
            System.out.println("Digite color de ojos ");
            String color_ojos =sc.nextLine();
            cc.setColordeojos(color_ojos,x);/*estudiante.colordeojos[x];*/
            
            System.out.println("Digite color de pelo ");
            String color_pelo =sc.nextLine();
            cc.setColordepelo(color_pelo,x);/*estudiante.colordepelo[x];*/
	}
        
	 /*System.out.println("Digite el criterio por el que desea buscar");
        System.out.println("Criterio 1: nombre");
        System.out.println("Criterio 2: sexo");
        System.out.println("Criterio 3: edad");
        System.out.println("Criterio 4: peso");
        System.out.println("Criterio 5: color de pelo");
        System.out.println("Criterio 6: color de piel");
        System.out.println("Criterio 7: color de ojos");
        System.out.println("Criterio 8: nacionalidad");
        System.out.println("Criterio 9: telefono"); 
        int opcion = sc.nextInt();
        
       System.out.println("Ingrese palabra a buscar: "); 
        String palabra = sc.nextLine();
        cc.setPalabra(sc.nextLine());        
	cc.busqueda(opcion, cant_estu);*/
        
        cc.imprimir_listado(cant_estu);
        
    }  
}        
