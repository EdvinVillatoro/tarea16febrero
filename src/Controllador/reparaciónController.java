package Controllador;
//HECHO POR BRITANY

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import Modelos.reparaciónModel;
import Modelos.reparación;
import Vistas.frmPrincipal;
import Vistas.frmPropietarios;
import Vistas.frmReparación;

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
        this.TablaReparación.addColumn("DESCRIPCIÓN DE LA REPARACIÓN A REALIZAR");
        this.TablaReparación.addColumn("TÉCNICO ASIGNADO");
        this.TablaReparación.addColumn("FECHA DE INGRESO");
            
        this.VistaReparación.jtRegistrarreparación.setModel(TablaReparación);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnEnviar) {
            this.VistaReparación.btnRegistrarReparación.addActionListener(this);
            
            this.VistaReparación.setLocationRelativeTo(null);
            this.VistaReparación.setVisible(true);
            
        }
     
        if(e.getSource()== this.VistaReparación.btnRegistrarReparación){
            this.TablaReparación.AgregarReparación(this.VistaReparación.txtCódigo.getText(),
                    this.VistaReparación.txtDescripción.getText(),
                    this.VistaReparación.txtTécnicoAsignado.getText(),
                    this.VistaReparación.txtFechaingreso.getText());
            
            this.TablaReparación.addRow(new Object[ ]{this.ModeloReparación.ListaReparación.get(0).getCódigo(),
                this.ModeloReparación.ListaReparación.get(0).getDescripción(),
                this.ModeloReparación.ListaReparación.get(0).getTécnicoAsignado(),
                this.ModeloReparación.ListaReparación.get(0).getFechaIngreso()});
            }
            
        }
    }
    
    
    
    
    
    

   
    
    
    
}
