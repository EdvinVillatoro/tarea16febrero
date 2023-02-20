package Controllador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import Modelos.equipoModel;
import Vistas.frmPrincipal;
import Vistas.frmEquipo;

public class equiposController implements ActionListener{

   frmPrincipal VistaPrincipal;
   frmEquipo VistaEquipo;
   equipoModel Modelequipo;
   public DefaultTableModel TablaEquipo = new DefaultTableModel();
   
   //Levantar de forma automatica el formulario principal

    public equiposController(frmPrincipal VistaPrincipal, frmEquipo VistaEquipo, equipoModel ModeloUsuarios) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEquipo = VistaEquipo;
        this.Modelequipo = ModeloUsuarios;
        
        
        //Poner a la escucha los botones correspondientes
        
        this.VistaPrincipal.btnEquipo.addActionListener(this);
        
        //Levantar la vista principal
        
        //this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        this.TablaEquipo.addColumn("MARCA");
        this.TablaEquipo.addColumn("MODELO");
        this.TablaEquipo.addColumn("TIPO");
        this.TablaEquipo.addColumn("PROBLEMA");
            
        this.VistaEquipo.jtEquipo.setModel(TablaEquipo);
    }
       
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnEquipo){
            
            //Poner a la escucha los botones de la vista usuario
            
            this.VistaEquipo.btnIngresarpc.addActionListener(this);
            
            //Leventar la vista usuarios
            
            this.VistaEquipo.setLocationRelativeTo(null);
            this.VistaEquipo.setVisible(true);
            
        }
        
        if(e.getSource()== this.VistaEquipo.btnIngresarpc){
            this.Modelequipo.AgregarEquipo(this.VistaEquipo.txtComputadora.getText(),
                    this.VistaEquipo.txtMarca.getText(),
                    this.VistaEquipo.txtModelo.getText(),
                    this.VistaEquipo.txtProblema.getText());
            
            this.TablaEquipo.addRow(new Object[]{this.Modelequipo.ListaEquipo.get(0).getMarca(),
            this.Modelequipo.ListaEquipo.get(0).getModelo(),
            this.Modelequipo.ListaEquipo.get(0).getComputadora(),
            this.Modelequipo.ListaEquipo.get(0).getProblema()});
            
        }
    }
    
}