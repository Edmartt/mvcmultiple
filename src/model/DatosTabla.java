/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.table.DefaultTableModel;
import view.Datos;

/**
 *
 * @author sam
 */
public class DatosTabla {
     
    public void crearTabla(Datos dat,Persona p){
        
        String []array={p.getCedula(),p.getNombre(),p.getApellido(),p.getEdad()};
        DefaultTableModel model=new DefaultTableModel();
        dat.tb_datos.setModel(model);
        model.addColumn("Cedula");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Edad1"); 
        model.addRow(array);
    
    }
    
}
