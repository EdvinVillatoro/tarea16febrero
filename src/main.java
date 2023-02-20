
import Controllador.entregasController;
import Controllador.equiposController;
import Modelos.entregaModel;
import Modelos.equipoModel;
import Vistas.frmEntrega;
import Vistas.frmPrincipal;
import Vistas.frmEquipo;

public class main {
    
    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmEquipo VistaEquipo = new frmEquipo();
        equipoModel ModeloEquipo = new equipoModel();
        frmEntrega VistaEntrega = new frmEntrega();
        entregaModel ModeloEntrega = new entregaModel();
        
        equiposController ControladorUsuarios = new equiposController(VistaPrincipal,
                VistaEquipo, ModeloEquipo);
        
        entregasController ControladorEntregas = new entregasController(VistaPrincipal, VistaEntrega, ModeloEntrega);
    }
    
}
