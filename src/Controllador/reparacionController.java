package Controllador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import Modelos.ReparacionModel;
import Vistas.frmPrincipal;
import Vistas.frmReparacion;


public class reparacionController implements ActionListener{
    
frmPrincipal VistaPrincipal;
frmReparacion VistaReparación;
ReparacionModel ModeloReparacion;
public DefaultTableModel TablaReparacion = new DefaultTableModel();

public reparacionController (frmPrincipal VistaPrincipal, frmReparacion VistaReparación, ReparacionModel ModeloReparacion) {
    this.VistaPrincipal = VistaPrincipal;
    this.VistaReparación = VistaReparación;
    this.ModeloReparacion = ModeloReparacion;
    
    this.VistaPrincipal.btnEnviar.addActionListener(this);
    
    this.VistaPrincipal.setVisible(true);
        this.TablaReparacion.addColumn("CÓDIGO DE EQUIPO");
        this.TablaReparacion.addColumn("DESCRIPCIÓN DE LA REPARACIÓN A REALIZAR");
        this.TablaReparacion.addColumn("TÉCNICO ASIGNADO");
        this.TablaReparacion.addColumn("FECHA DE INGRESO");
            
        this.VistaReparación.jtTablaRegistrar.setModel(TablaReparacion);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnEnviar) {
            this.VistaReparación.btnRegistrar.addActionListener(this);
            
            this.VistaReparación.setLocationRelativeTo(null);
            this.VistaReparación.setVisible(true);
            
        }
     
        if(e.getSource()== this.VistaReparación.btnRegistrar){
            this.ModeloReparacion.AgregReparacion(this.VistaReparación.txtCodigo.getText(),
                    this.VistaReparación.txtDescripcion.getText(),
                    this.VistaReparación.txtTecnico.getText(),
                    this.VistaReparación.txtFecha.getText());
            
            this.TablaReparacion.addRow(new Object[ ]{this.ModeloReparacion.ListaReparacion.get(0).getCodigo(),
                this.ModeloReparacion.ListaReparacion.get(0).getDescripcion(),
                this.ModeloReparacion.ListaReparacion.get(0).getTecnico(),
                this.ModeloReparacion.ListaReparacion.get(0).getFecha()});
            }
            
        }
    }
