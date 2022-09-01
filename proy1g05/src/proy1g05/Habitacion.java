package proy1g5;

public class Habitacion {
    private NodoH next;
    private NodoH head;
    private NodoHu huesped;
    private NodoH tail;
    
    public Habitacion(){
        head=new NodoH(null,null);
        tail=head;
    }
    public boolean agregarHuesped(String rut, String nombre, int edad, int nro){
          Huesped h=new Huesped (rut,nombre,edad,nro);
    }
}
