package listaContactos;

import lista.PosicionIlegalException;

public class ClienteMain {
    public static void main(String[] args) {
        //crear una lista de contactos
        ListaDeContactos ldc = new ListaDeContactos();
        try{
            //agregarmos algunos contactos
            ldc.agregarContacto("Fernado", "Castro", 
                "Laguna de camamo 150 Ote. Las Quintas. Culiacan, Sinaloa", "FernandoC@gmail.com", 
                "6677511616","6677500500");
            ldc.agregarContacto("Maria","Vargas","Isla del Socorro 1085, col.las Vegas, Culiacan, Sinaloa",
            "mariav@gmail.com","667160732","6672514532" );



        }catch (PosicionIlegalException e) {
            e.printStackTrace();


    
        }
    }
    
}
