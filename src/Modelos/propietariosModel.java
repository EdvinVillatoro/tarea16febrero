package Modelos;

import java.util.ArrayList;

public class propietariosModel {
    public ArrayList<Propietarios> ListaPropietarios = new ArrayList<Propietarios>();
    
    public void AgregarPropietarios(String apellidos, String nombres, String telefono){
        
        Propietarios NuevoPropietario = new Propietarios (apellidos, nombres, telefono);
        this.ListaPropietarios.add(NuevoPropietario);
        
    }
    
    public ArrayList ListarUsuarios(){
        return ListaPropietarios;
    }
    
}
