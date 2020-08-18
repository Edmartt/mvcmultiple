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
     
    /**
     * Este método nos crea el diseño de la tabla que tendremos por defecto.
     * @param dat este parámetro es de la clase Datos, que es la ventana en la cual está la tabla que usaremos
     */
    public void crearTabla(Datos dat){
        
        DefaultTableModel model=new DefaultTableModel(); //Creamos un modelo nuevo para nuestra tabla
        dat.tb_datos.setModel(model); //Le pasamos como argumento el modelo anterior para que al instanciar sea este diseño
        model.addColumn("Cedula");
        model.addColumn("Nombre"); //Estas son las columnas que agregamos al modelo de la tabla, se pueden aumentar a gusto
        model.addColumn("Apellido");
        model.addColumn("Edad"); 
    
    }
    /**
     * Con este método nos encargamos de llenar la tabla
     * 
     * @param dat 
     * @param p
     * Nos recibe dos argumentos, uno de tipo Datos(la segunda ventana) y otro de tipo persona
     * 
     * En un array de Strings guardamos los datos que se obtienen de la clase Persona por medio sus getters
     * debemos acceder al modelo de nuestra tabla, y este modelo nos da acceso al método addRow, que nos permitiría
     * Llenar una fila de la tabla mediante el array creado previamente
     */
    public void llenarTablar(Datos dat,Persona p){
        String []array={p.getCedula(),p.getNombre(),p.getApellido(),p.getEdad()};
        DefaultTableModel model=(DefaultTableModel) dat.tb_datos.getModel();
        model.addRow(array);
    }
    
    /**
     * Limpiamos las cajas de texto al poner su texto en null
     * @param dat objeto de la clase Datos para acceder a los elementos de la ventana 2
     */
    public void limpiarCajas(Datos dat){
        dat.txt_cedula.setText(null);
        dat.txt_nombre.setText(null);
        dat.txt_apellido.setText(null);
        dat.txt_edad.setText(null);
    }
    
}
