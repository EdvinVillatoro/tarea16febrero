
import Controllador.entregasController;
import Controllador.equiposController;
import Controllador.propietariosController;
import Modelos.entregaModel;
import Modelos.equipoModel;
import Vistas.frmEntrega;
import Vistas.frmPrincipal;
import Vistas.frmEquipo;
import Vistas.frmPropietarios;
import Modelos.propietariosModel;

public class main {
    
    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmEquipo VistaEquipo = new frmEquipo();
        equipoModel ModeloEquipo = new equipoModel();
        frmEntrega VistaEntrega = new frmEntrega();
        entregaModel ModeloEntrega = new entregaModel();
        frmPropietarios VistaPropietarios = new frmPropietarios(VistaPrincipal,true);
        propietariosModel ModeloPropietarios = new propietariosModel();
        
       
        
        equiposController ControladorUsuarios = new equiposController(VistaPrincipal,
                VistaEquipo, ModeloEquipo);
        
        entregasController ControladorEntregas = new entregasController(VistaPrincipal, VistaEntrega, ModeloEntrega);
        
        propietariosController ControladorPropietarios = new propietariosController(VistaPrincipal, VistaPropietarios, ModeloPropietarios);
    }
    
}
