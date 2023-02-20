
import Controllador.equiposController;
import Modelos.equipoModel;
import Vistas.frmPrincipal;
import Vistas.frmEquipo;

public class main {
    
    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmEquipo VistaEquipo = new frmEquipo();
        equipoModel ModeloEquipo = new equipoModel();
        
        equiposController ControladorUsuarios = new equiposController(VistaPrincipal,
                VistaEquipo, ModeloEquipo);
    }
    
}
