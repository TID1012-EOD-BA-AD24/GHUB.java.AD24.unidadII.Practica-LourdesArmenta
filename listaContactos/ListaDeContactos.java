package listaContactos;
import lista.Lista;
import lista.PosicionIlegalException;

public class ListaDeContactos {
    //Atributos
    private Lista<Contacto> contactos;
    //Metodos
    //Constructor

    public ListaDeContactos() {
        contactos = new Lista<Contacto>();

    }

    /**
     * Retorna una lista de todos los contactos
     */
    public Lista<Contacto> mostrarTodosLosContactos(){
        return contactos;
    }

    /**
     * Agrega un nuevo contacto a la lista, si todavia no hay nigum contacto
     * con los nombre y apellidos dados va a lanzar
     * una @throws  PosicionIlegalException
     */

    public boolean agregarContacto(String nombres, String apellidos, String direccion, 
             String Correo, String telefono, String celular) throws PosicionIlegalException{
                Contacto con = buscarContacto(nombres,apellidos);
                if (con ==null) //se puede agregar porque no existia
                {
                    Contacto nuevo = new Contacto(nombres, apellidos, direccion, Correo, telefono,celular);
                    contactos.agregar(nuevo);
                    return true;

                }else {
                    return false;
                }

    }

    public Contacto buscarContacto(String nombres, String apellidos) 
        throws PosicionIlegalException{
            for (int i=0;i<contactos.getTamanio();i++){
                Contacto con = contactos.getValor(i);
                if (nombres.equals(con.getNombres()) && apellidos.equals(con.getApellido())){
                    return con;
                }

            }
            return null;//no lo encontro, devuelve nulo

        }

    


    
}
