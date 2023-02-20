package Modelos;

import java.util.ArrayList;

public class equipoModel {
    public ArrayList<equipo> ListaEquipo = new ArrayList<equipo>();
    
    public void AgregarEquipo(String Marca, String Modelo, String Computadora, String Problema){
        
        equipo Nuevoequipo = new equipo (Marca, Modelo, Computadora, Problema);
        this.ListaEquipo.add(Nuevoequipo);
        
    }
    
    public ArrayList ListarUsuarios(){
        return ListaEquipo;
    }
    
}
