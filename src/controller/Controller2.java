/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DatosTabla;
import model.Persona;
import view.Datos;

/**
 *
 * @author sam
 */
public class Controller2 implements ActionListener {

    Datos dat;
    DatosTabla dattab;
    Persona p;
    Controller1 cont;
   
    
    public Controller2(Controller1 cont) {
        this.cont=cont;
        dat = new Datos();
        dattab = new DatosTabla();
        p = new Persona();
        dattab.crearTabla(dat, p);
        buttons();
      
    }
    
    private void buttons() {
        dat.btn_insertar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == dat.btn_insertar) {
            p.setNombre(dat.txt_nombre.getText());
            p.setApellido(dat.txt_apellido.getText());
            p.setCedula(dat.txt_cedula.getText());
            p.setEdad(dat.txt_edad.getText());
            dattab.crearTabla(dat, p);
            System.out.println(p.getNombre());
        }
        
    }
    
}
