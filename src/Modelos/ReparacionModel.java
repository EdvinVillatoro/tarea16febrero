package Modelos;

import java.util.ArrayList;

public class ReparacionModel {
    public ArrayList<Reparacion> ListaReparacion = new ArrayList<Reparacion>();
    
    public void AgregReparacion(String Codigo, String Descripcion, String Tecnico, String Fecha){
        
        Reparacion NuevoReparacion = new Reparacion (Codigo, Descripcion, Tecnico, Fecha);
        this.ListaReparacion.add(NuevoReparacion);
        
    }
    
    public ArrayList ListarReparacion(){
        return ListaReparacion;
    }
    
}
