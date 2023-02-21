package Controllador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import Modelos.propietariosModel;
import Vistas.frmPrincipal;
import Vistas.frmPropietarios;

public class propietariosController implements ActionListener{

   frmPrincipal VistaPrincipal;
   frmPropietarios VistaPropietario;
   propietariosModel ModeloPropietarios;
   public DefaultTableModel TablaPropietarios = new DefaultTableModel();
   
   //Levantar de forma automatica el formulario principal

    public propietariosController(frmPrincipal VistaPrincipal, frmPropietarios VistaPropietario, propietariosModel ModeloPropietarios) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPropietario = VistaPropietario;
        this.ModeloPropietarios = ModeloPropietarios;
        
        
        //Poner a la escucha los botones correspondientes
        
        this.VistaPrincipal.btnRegistro.addActionListener(this);
        
        //Levantar la vista principal
        
        //this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        this.TablaPropietarios.addColumn("APELLIDO");
        this.TablaPropietarios.addColumn("NOMBRE");
        this.TablaPropietarios.addColumn("TELEFONO");
            
        this.VistaPropietario.jtPropietarios.setModel(TablaPropietarios);
    }
       
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnRegistro){
            
            //Poner a la escucha los botones de la vista usuario
            
            this.VistaPropietario.btnInsertar.addActionListener(this);
            
            //Leventar la vista usuarios
            
            this.VistaPropietario.setLocationRelativeTo(null);
            this.VistaPropietario.setVisible(true);
            
        }
        
        if(e.getSource()== this.VistaPropietario.btnInsertar){
            this.ModeloPropietarios.AgregarPropietarios(this.VistaPropietario.txtApellido.getText(),
                    this.VistaPropietario.txtNombre.getText(),
                    this.VistaPropietario.txtTelefono.getText());
            
            this.TablaPropietarios.addRow(new Object[]{this.ModeloPropietarios.ListaPropietarios.get(0).getApellidos(),
            this.ModeloPropietarios.ListaPropietarios.get(0).getNombres(),
            this.ModeloPropietarios.ListaPropietarios.get(0).getTelefono()});
            
            
        }
    }
    
}
