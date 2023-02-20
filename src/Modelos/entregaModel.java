/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class entregaModel {
    public ArrayList<entrega> ListaEntrega = new ArrayList<entrega>();
    
    public void entregarEquipo(String codigo, String nombreP, String fechaE, String descripcion){
        entrega Nuevaentrega = new entrega (codigo, nombreP, fechaE, descripcion);
        this.ListaEntrega.add(Nuevaentrega);
    }
    
    public ArrayList ListarEntregas(){
        return ListaEntrega;
    }
}
