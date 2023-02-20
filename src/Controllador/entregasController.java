/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import Modelos.entregaModel;
import Vistas.frmEntrega;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class entregasController implements ActionListener{
        frmPrincipal VistaPrincipal;
        frmEntrega VistaEntrega;
        entregaModel ModelEntrega;
        public DefaultTableModel TablaEntrega = new DefaultTableModel();
        
        public entregasController(frmPrincipal VistaPrincipal, frmEntrega VistaEntrega, entregaModel ModelEntrega){
            this.VistaPrincipal = VistaPrincipal;
            this.VistaEntrega = VistaEntrega;
            this.ModelEntrega = ModelEntrega;


            //Poner a la escucha los botones correspondientes

            this.VistaPrincipal.btnEntregar.addActionListener(this);

            //Levantar la vista principal

            this.VistaPrincipal.setVisible(true);
            this.TablaEntrega.addColumn("CODIGO");
            this.TablaEntrega.addColumn("PERSONA");
            this.TablaEntrega.addColumn("FECHA");
            this.TablaEntrega.addColumn("DESCRIPCION");

            this.VistaEntrega.jtEntregar.setModel(TablaEntrega);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()== this.VistaPrincipal.btnEntregar){
            
            //Poner a la escucha los botones de la vista usuario
            
            this.VistaEntrega.btnEntregarE.addActionListener(this);
            
            //Leventar la vista usuarios
            
            this.VistaEntrega.setLocationRelativeTo(null);
            this.VistaEntrega.setVisible(true);
            
        }
        
        if(e.getSource()== this.VistaEntrega.btnEntregarE){
            this.ModelEntrega.entregarEquipo(this.VistaEntrega.txtCodigoE.getText(),
                    this.VistaEntrega.txtNombreP.getText(),
                    this.VistaEntrega.txtFechaE.getText(),
                    this.VistaEntrega.txtDescripcionS.getText());
            
            this.TablaEntrega.addRow(new Object[]{this.ModelEntrega.ListaEntrega.get(0).getCodigo(),
            this.ModelEntrega.ListaEntrega.get(0).getNombreP(),
            this.ModelEntrega.ListaEntrega.get(0).getFechaE(),
            this.ModelEntrega.ListaEntrega.get(0).getDescripcion()});
            
        }
    }
    
}
