package Controllador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import Modelos.reparaciónModel;
import Modelos.reparación;
import Vistas.frmPrincipal;
import Vistas.frmPropietarios;
import Vistas.frmReparación;
import 

public class reparaciónController implements ActionListener{
    
frmPrincipal VistaPrincipal;
frmReparación VistaReparación;
reparaciónModel ModeloReparación;

public DefaultTableModel TablaReparación = new DefaultTableModel();

public reparaciónController (frmPrincipal VistaPrincipal, frmReparación VistaReparación, reparaciónModel ModeloReparación) {
    this.VistaPrincipal = VistaPrincipal;
    this.VistaReparación = VistaReparación;
    this.ModeloReparación = ModeloReparación;
    
    this.VistaPrincipal.btnEnviar.addActionListener(this);
    
    this.VistaPrincipal.setVisible(true);
        this.TablaReparación.addColumn("CÓDIGO DE EQUIPO");
        this.TablaPropietarios.addColumn("NOMBRE");
        this.TablaPropietarios.addColumn("TELEFONO");
            
        this.VistaPropietario.jtPropietarios.setModel(TablaPropietarios);
}
    
    
    
    
    
    

   
    
    
    
}
