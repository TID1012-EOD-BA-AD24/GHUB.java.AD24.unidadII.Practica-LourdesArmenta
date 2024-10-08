package hash;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Iterator;

public class TestHashTableCiudad {
    public static void main(String[] args) {
        //instanciar varias personas
        Ciudad c1 = new Ciudad("Buenos Aires", 1000000, "Buenos Aires", "Argentina");
        Ciudad c2 = new Ciudad("Mexico DF", 2000000, "Distrito Federal", "Mexico");
        Ciudad c3 = new Ciudad("Madrid", 3000000, "Madrid", "España");
        Ciudad c4 = new Ciudad("Madrid", 4000000, "Sinaloa", "Mexico");

        //crear una tabla hash
        Hashtable<String,Ciudad> tabla = new Hashtable<String,Ciudad>();
        //agregar las personas a la tabla tomando su nombre como clave
        tabla.put(c1.getNombre(),c1);
        tabla.put(c2.getNombre(),c2);
        tabla.put(c3.getNombre(),c3);
        tabla.put(c4.getNombre(),c4);

        //acceder a cada elemento de la tabla por su clase
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Ingrese el nombre de la ciudad: ");
        String nombreCiudad = sc.nextLine();
        Ciudad encontrado = tabla.get(nombreCiudad);
        if(encontrado != null)
            System.out.println(tabla.get(nombreCiudad));
        else
             System.out.println("No se encontro la ciudad");


        System.out.println("Recorrer todos los elementos de la tabla");

        //Recorrer todos los elementos de la collección y mostrarlos por pantalla
        //obtener una enumeraciom de las claves existentes en la tabala
        //la recorro uno a uno y por cada uno de los accesos obtengo el elemento asociado (Persona  )
        String aux;
        Enumeration<String> claves = tabla.keys();
        while(claves.hasMoreElements()){
            aux = claves.nextElement();
            System.out.println(tabla.get(aux));
        }

       
    }
    
}
